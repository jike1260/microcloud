package com.lz.service;

import com.lz.SpringCloud_8001_Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest(classes = SpringCloud_8001_Main.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptServiceTest {

    @Autowired
    private DeptService deptService;

    @Test
    public void get() {
        System.out.println(deptService.get(1));
    }

}