package com.lz.service.impl;

import com.lz.pojo.Dept;
import com.lz.service.DeptService;
import org.springframework.stereotype.Service;



/**
 * @ClassName DeptServiceImlp
 * @Description TODO
 * @Author LZ
 * @Date 2019/8/5 18:47
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {


    @Override
    public Dept get(Integer id) {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("研发部");
        return dept;
    }

}
