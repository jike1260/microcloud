package com.lz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicrocloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudEurekaApplication.class, args);
    }

}
