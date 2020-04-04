package com.inkfish.seckill.service;

import com.inkfish.seckill.model.Product;
import org.springframework.stereotype.Service;

/**
 * @author HALOXIAO
 **/
@Service
public interface BaseProductService {

    public boolean addProduct(Product product);


}
