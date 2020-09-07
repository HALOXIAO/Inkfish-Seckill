package com.inkfish.seckill.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.inkfish.seckill.common.REDIS_PRODUCT_CACHE;
import com.inkfish.seckill.mapper.ProductMapper;
import com.inkfish.seckill.mapper.SeckillProductMapper;
import com.inkfish.seckill.model.Product;
import com.inkfish.seckill.model.SeckillProduct;
import com.inkfish.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

/**
 * @author HALOXIAO
 * @since 2020-09-07 10:39
 **/
@Service
public class SeckillServiceImpl implements SeckillService {


    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    SeckillProductMapper seckillProductMapper;


    @Autowired
    ProductMapper productMapper;

    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(REDIS_PRODUCT_CACHE.PRODUCT_DATE_FORMAT.getValue());

    @Override
    public boolean checkSeckillTime(Integer productId) {
        List<Object> obj = stringRedisTemplate.opsForHash().values(REDIS_PRODUCT_CACHE.SALES_PRODUCT_INFORMATION_HASH_NAMESPACE.getValue() + productId);
        String startTime = obj.get(0).toString();
        String endTime = obj.get(1).toString();
        if (startTime == null) {
            SeckillProduct product = seckillProductMapper.getOne(new QueryWrapper<SeckillProduct>().select("start_date", "end_date"));
            startTime = product.getStartDate().toLocalDateTime().format(FORMATTER);
            endTime = product.getEndDate().toLocalDateTime().format(FORMATTER);
        }
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(LocalDateTime.parse(startTime)) || now.isAfter(LocalDateTime.parse(endTime)))
            return false;
        return true;
    }

    @Override
    public boolean checkProductStore(Integer productId) {
        int count;
        Object o = stringRedisTemplate.opsForHash().get(REDIS_PRODUCT_CACHE.SALES_PRODUCT_INFORMATION_HASH_NAMESPACE.getValue() + productId, 2);
        if (Objects.isNull(o)) {
            SeckillProduct product = seckillProductMapper.getOne(new QueryWrapper<SeckillProduct>().select("store"));
            count = product.getStock();
        } else {
            count = (int) o;
        }
        return count >= 0;
    }

    @Override
    public boolean seckillProductPreheat(Integer productId) {
        Product product = productMapper.getOne(new QueryWrapper<Product>().eq("id", productId));
        stringRedisTemplate.executePipelined(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
//                redisConnection.set
                return null;
            }
        });
        return false;
    }
}
