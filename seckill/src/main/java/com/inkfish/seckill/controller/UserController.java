package com.inkfish.seckill.controller;

import com.inkfish.seckill.common.RESULT_BEAN_STATUS_CODE;
import com.inkfish.seckill.common.ResultBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HALOXIAO
 **/
@RestController
public class UserController {

    @PostMapping("/heat")
    public ResultBean<Boolean> heatReservoir() {
        return new ResultBean<>("success", RESULT_BEAN_STATUS_CODE.SUCCESS);
    }



}
