package com.inkfish.seckill.common;

/**
 * @author HALOXIAO
 **/
public enum REDIS_PRODUCT_CACHE {

    /**
     * 销售开始时间
     * */
    SALES_BEGIN_TIME_STRING(""),

    /**
     *库存售完标记
     * */
    SALES_OUT_TAG_HASH(""),

    /**
     * 商品库存
     * */
    SALES_PRODUCT_COUNT_STRING_NAMESPACE("");


    private String value;

    REDIS_PRODUCT_CACHE(String value){
        this.value = value;
    }

    public String getValue(){
       return this.value;
    }

}
