package com.lz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicrocloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudEureka7002Application.class, args);
    }

}
