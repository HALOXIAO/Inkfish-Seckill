package com.inkfish.seckill.common.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author HALOXIAO
 **/
@Component
public class Lock {

    private final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public Lock(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }


}
