package com.inkfish.seckill.service;

/**
 * @author HALOXIAO
 * @since 2020-09-07 10:37
 **/
public interface SeckillService {

    boolean checkSeckillTime(Integer productId);


    boolean checkProductStore(Integer productId);

    boolean seckillProductPreheat(Integer productId);



}
