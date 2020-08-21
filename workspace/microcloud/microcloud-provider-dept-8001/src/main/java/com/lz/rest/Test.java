package com.lz.rest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Test
 * @Description TODO
 * @Author LZ
 * @Date 2019/8/6 11:52
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        String str = "abc";
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1" + str);
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("2" + str);
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("3" + str);
            }
        });
    }
}
