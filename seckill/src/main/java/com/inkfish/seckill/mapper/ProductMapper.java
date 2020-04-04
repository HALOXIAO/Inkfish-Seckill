package com.inkfish.seckill.mapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inkfish.seckill.mapper.dao.ProductMapperInterface;
import com.inkfish.seckill.model.Product;
import org.springframework.stereotype.Repository;

/**
 * @author HALOXIAO
 **/
@Repository
public class ProductMapper extends ServiceImpl<ProductMapperInterface, Product> {
}
