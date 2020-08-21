package com.lz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @ClassName RestConfig
 * @Description TODO Rest 服务配置类
 * @Author LZ
 * @Date 2019/8/5 19:39
 * @Version 1.0
 **/
@Configuration
public class RestConfig {

    /**
     * @Description //TODO Http头信息配置
     * @Param []
     * @return org.springframework.http.HttpHeaders
     * @Author LZ
     * @Date 2019/8/6 10:12
     **/
    @Bean
    public HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        //1.认证原始信息
        String auth = "ninja650:ninja650";
        //2.加密处理
        byte[] encode = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        //3.头信息配置 加密信息和 Basic 之间一定要有一个空格
        String authHeader = "Basic " + new String(encode);
        headers.set("Authorization",authHeader);
        return headers;
    }

    /**
     * @Description //TODO 获取 RestTemplate 实例
     * @Param []
     * @return org.springframework.web.client.RestTemplate
     * @Author LZ
     * @Date 2019/8/6 16:43
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getTestTemplate(){
        return new RestTemplate();
    }

    /*public static void main(String[] args) {
        //1.认证原始信息
        String auth = "ninja:ninja650";
        //2.加密处理
        byte[] encode = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        //3.头信息配置 加密信息和 Basic 之间一定要有一个空格
        String authHeader = "Basic " + new String(encode);
        System.out.println(authHeader);
    }*/
}
