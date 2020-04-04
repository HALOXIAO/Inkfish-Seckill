package com.inkfish.seckill.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.inkfish.seckill.mapper.ProductMapper;
import com.inkfish.seckill.model.Product;
import com.inkfish.seckill.service.BaseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HALOXIAO
 **/
@Service
public class BaseProductServiceImpl implements BaseProductService {

    private final ProductMapper productMapper;

    @Autowired
    public BaseProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.save(product);
    }


    @Override
    public boolean deleteProduct(Integer id) {
        return productMapper.remove(new QueryWrapper<Product>().eq("id", id));
    }

    @Override
    public boolean updateProduct(Product product) {
        return productMapper.update(product, new QueryWrapper<Product>().eq("id", product.getId()));
    }
    @Override
    public boolean addProducts(List<Product> productList) {
        return productMapper.saveBatch(productList);
    }
}
