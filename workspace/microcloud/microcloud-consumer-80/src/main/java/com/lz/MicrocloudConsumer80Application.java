package com.lz;

import com.lz.commons.config.MyLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ribbonClient",configuration = MyLoadBalanceConfig.class)
public class MicrocloudConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudConsumer80Application.class, args);
    }

}
