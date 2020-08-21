package com.lz.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName MyPwdEncoder
 * @Description TODO 内存用户验证时，Spring boot 2.X 引用的security 依赖是 spring security 5.X版本，此版本需要提供一个PasswordEncorder的实例，否则后台汇报错误：
 *                   java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"
 *                   并且页面毫无响应。
 * @Author LZ
 * @Date 2019/8/6 16:26
 * @Version 1.0
 **/
public class MyPwdEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence.equals(s);
    }
}
