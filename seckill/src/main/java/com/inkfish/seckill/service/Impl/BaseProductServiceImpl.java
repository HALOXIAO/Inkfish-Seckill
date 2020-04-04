package com.inkfish.seckill.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.inkfish.seckill.mapper.ProductMapper;
import com.inkfish.seckill.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HALOXIAO
 **/
@Service
public class BaseProductServiceImpl {

    private final ProductMapper productMapper;

    @Autowired
    public BaseProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public boolean addProduct(Product product) {
        return productMapper.save(product);
    }

    public boolean deleteProduct(Integer id) {
        return productMapper.remove(new QueryWrapper<Product>().eq("id", id));
    }

    public boolean updateProduct(Product product) {
        return productMapper.update(product, new QueryWrapper<Product>().eq("id", product.getId()));
    }

    public Product getProduct(){
        return null;
    }

}
