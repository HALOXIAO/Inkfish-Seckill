package com.inkfish.seckill.mapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inkfish.seckill.mapper.dao.OrderMapperInterface;
import com.inkfish.seckill.model.Order;
import org.springframework.stereotype.Repository;

/**
 * @author HALOXIAO
 **/
@Repository
public class OrderMapper extends ServiceImpl<OrderMapperInterface, Order> {
}
