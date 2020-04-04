package com.inkfish.seckill.controller;

import com.inkfish.seckill.common.RESULT_BEAN_STATUS_CODE;
import com.inkfish.seckill.common.ResultBean;
import com.inkfish.seckill.model.Product;
import com.inkfish.seckill.model.convert.ProductParamToProduct;
import com.inkfish.seckill.model.param.ProductParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HALOXIAO
 **/
@RestController
public class ProductController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/product/count")
    public ResultBean<Integer> getProductCount(String productId) {
        ResultBean<Integer> bean = new ResultBean<>("success", RESULT_BEAN_STATUS_CODE.SUCCESS);
        return bean;
    }

    @PostMapping("/product")
    public ResultBean<Boolean> addProduct(@RequestBody ProductParam productParam) {
        Product product = ProductParamToProduct.INSTANCE.from(productParam);

        ResultBean<Boolean> bean = new ResultBean<>("success", RESULT_BEAN_STATUS_CODE.SUCCESS);
        return bean;
    }

}
