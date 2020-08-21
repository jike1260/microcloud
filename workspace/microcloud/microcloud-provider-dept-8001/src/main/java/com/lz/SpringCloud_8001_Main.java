package com.lz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SpringCloud_8001_Main
 * @Description TODO
 * @Author LZ
 * @Date 2019/8/5 18:53
 * @Version 1.0
 **/
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class SpringCloud_8001_Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud_8001_Main.class,args);
    }
}
