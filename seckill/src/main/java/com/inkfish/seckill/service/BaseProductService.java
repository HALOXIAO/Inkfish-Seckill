package com.inkfish.seckill.service;

import com.inkfish.seckill.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HALOXIAO
 **/
@Service
public interface BaseProductService {

    boolean addProduct(Product product);

    boolean deleteProduct(Integer id);

    boolean updateProduct(Product product);

    boolean addProducts(List<Product> productList);

    boolean deleteProducts(List<Integer> ids);


}
