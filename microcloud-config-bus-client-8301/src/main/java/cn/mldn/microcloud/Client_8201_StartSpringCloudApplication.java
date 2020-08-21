package cn.mldn.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class Client_8201_StartSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(Client_8201_StartSpringCloudApplication.class, args);
	}
}
