package cn.mldn.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Config_7102_StartSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(Config_7102_StartSpringCloudApplication.class, args);
	}
}
