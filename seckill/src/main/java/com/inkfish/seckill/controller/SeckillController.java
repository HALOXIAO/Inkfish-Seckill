package com.inkfish.seckill.controller;

import com.inkfish.seckill.common.ResultBean;
import com.inkfish.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HALOXIAO
 * @since 2020-09-07 10:33
 **/
@RestController
public class SeckillController {

    @Autowired
    SeckillService seckillService;

    @PostMapping("/seckill")
    public ResultBean<Boolean> placeOrder(Integer order) {
        return null;
    }
}
