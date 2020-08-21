package com.lz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @ClassName WebSecurityConfig
 * @Description TODO 统一安全配置类
 * @Author LZ
 * @Date 2019/8/6 15:45
 * @Version 1.0
 **/
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * @Description //TODO 认证信息配置
     * @Param [auth]
     * @return void
     * @Author LZ
     * @Date 2019/8/26 12:16
     **/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new MyPwdEncoder()).withUser("ninja").password("ninja650").roles("USER")
                .and().withUser("ADMIN").password("ADMIN123").roles("USER","ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //设置所有的访问都必须进行认证处理后才可以正常进行
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
        //设置所有的Rest服务 session 为无状态，以提升操作性能
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        //注册中心配置了security后, 报了 registration failed Cannot execute request on any known server 的错误,
        //原因是 2.1版本的security默认加上了 csrf 拦截, 所以需要通过重写方法, 把csrf拦截禁用
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/eureka/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }
}
