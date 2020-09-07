package com.inkfish.seckill.common;

/**
 * @author HALOXIAO
 **/
public enum REDIS_PRODUCT_CACHE {


    /**
     * 0是开始时间
     * 1是结束时间
     * 2为库存
     */
    SALES_PRODUCT_INFORMATION_HASH_NAMESPACE(""),

    PRODUCT_DATE_FORMAT("yyyy-MM-dd hh:mm:ss");


    private String value;

    REDIS_PRODUCT_CACHE(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
