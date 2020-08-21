package com.lz.commons.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName MyLoadBalanceConfig
 * @Description TODO 自定义 Ribbon 配置
 * @Author LZ
 * @Date 2019/8/28 9:14
 * @Version 1.0
 **/
public class MyLoadBalanceConfig {

    @Bean
    public IRule ribbonRule(){//IRule是所有的规则的标准

        return new com.netflix.loadbalancer.RandomRule();//随机访问
        //return new com.netflix.loadbalancer.AvailabilityFilteringRule();//可用资源过滤
    }
}
