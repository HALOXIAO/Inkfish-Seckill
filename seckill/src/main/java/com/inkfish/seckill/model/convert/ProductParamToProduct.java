package com.inkfish.seckill.model.convert;

import com.inkfish.seckill.model.Product;
import com.inkfish.seckill.model.param.ProductParam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author HALOXIAO
 **/

@Mapper
public interface ProductParamToProduct {

    ProductParamToProduct INSTANCE = Mappers.getMapper(ProductParamToProduct.class);


    @Mappings({
            @Mapping(target = "id", ignore = true)
    })
    Product from(ProductParam productParam);

}
