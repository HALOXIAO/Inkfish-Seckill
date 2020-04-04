package com.inkfish.seckill.mapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inkfish.seckill.mapper.dao.UserMapperInterface;
import com.inkfish.seckill.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author HALOXIAO
 **/
@Repository
public class UserMapper extends ServiceImpl<UserMapperInterface, User> {
}
