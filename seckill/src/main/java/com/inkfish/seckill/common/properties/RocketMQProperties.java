package com.inkfish.seckill.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author HALOXIAO
 **/
@Configuration
@ConfigurationProperties(prefix = "server.rocketmq.configuration")
public class RocketMQProperties {
    String nameSrvAddress;

    public String getNameSrvAddress() {
        return nameSrvAddress;
    }

    public void setNameSrvAddress(String nameSrvAddress) {
        this.nameSrvAddress = nameSrvAddress;
    }
}
