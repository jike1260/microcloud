package com.lz.rest;

import com.lz.pojo.Dept;
import com.lz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName DeptRest
 * @Description TODO
 * @Author LZ
 * @Date 2019/8/5 19:25
 * @Version 1.0
 **/
@RestController
public class DeptRest {

    @Autowired
    private DeptService deptService;

    /**
     * eureka的发现服务
     */
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/discover")
    public Object discover(){
        return client;
    }

    @GetMapping("/dept/sid")
    public Object id(HttpServletRequest request){
        return request.getSession().getId();
    }

    @GetMapping("/dept/get/{id}")
    public Object get(@PathVariable("id") Integer id){
        return deptService.get(id);
    }

}
