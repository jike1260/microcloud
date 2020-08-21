package com.lz.controller;

import com.lz.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @ClassName ConsumerDeptController
 * @Description TODO
 * @Author LZ
 * @Date 2019/8/5 19:46
 * @Version 1.0
 **/
@RestController
public class ConsumerDeptController {

    public static final String DEPT_GET_UEL = "http://MICROCLOUD-PROVIDER-DEPT/dept/get/";
    public static final String DEPT_LIST_UEL = "http://MICROCLOUD-PROVIDER-DEPT/dept/list/";
    public static final String DEPT_ADD_UEL = "http://MICROCLOUD-PROVIDER-DEPT/dept/add";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders headers;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer/get")
    public Object getDept(Integer id){
        ServiceInstance serviceInstance = loadBalancerClient.choose("MICROCLOUD-PROVIDER-DEPT");
        System.out.println("ServiceInstance host = " + serviceInstance.getHost()
                + "、port = " + serviceInstance.getPort()
                + "、serviceId = " + serviceInstance.getServiceId()
                + "、uri = " + serviceInstance.getUri());
        URI deptUri = URI.create(String.format("http://%s:%s/dept/get" + id,serviceInstance.getHost(),serviceInstance.getPort()));

        Dept dept = restTemplate.exchange(deptUri, HttpMethod.GET, new HttpEntity<>(headers),Dept.class).getBody();
        //未加权限
        //Dept dept = restTemplate.getForObject(DEPT_GET_UEL + id,Dept.class);
        return dept;
    }

    @RequestMapping("/consumer/list")
    public Object list(){
        List<Dept> list = restTemplate.exchange(DEPT_LIST_UEL, HttpMethod.GET, new HttpEntity<>(headers),List.class).getBody();
        //未加权限
        //List<Dept> list = restTemplate.getForObject(DEPT_LIST_UEL,List.class);
        return list;
    }

    /**
     * @Description //TODO 有 401 问题 待解决
     * @Param [dept]
     * @return java.lang.Object
     * @Author LZ
     * @Date 2019/8/6 11:29
     **/
    @RequestMapping("/consumer/add" )
    public Object add( Dept dept){
        HttpEntity<Object> httpEntity = new HttpEntity<>(dept, headers);
        System.out.println(httpEntity);
        Boolean flag = restTemplate.exchange(DEPT_ADD_UEL,HttpMethod.POST,httpEntity,Boolean.class).getBody();
        //未加权限
        //Boolean flag = restTemplate.postForObject(DEPT_ADD_UEL, dept, Boolean.class);
        return flag;
    }
}
