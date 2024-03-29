package com.lz.vo;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description TODO 部门
 * @Author LZ
 * @Date 2019/8/5 17:49
 * @Version 1.0
 **/
@SuppressWarnings("serial")
public class Dept implements Serializable {

    private Integer deptno;

    private String dname;

    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}