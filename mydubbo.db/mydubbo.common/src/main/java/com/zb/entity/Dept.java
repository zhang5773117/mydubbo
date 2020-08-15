package com.zb.entity;

import java.io.Serializable;

//反射  多线程  socket编程 tcp udp 注解 自定义注解 dom4j jucjava.util.concurrent
public class Dept implements Serializable {
    private Integer id;
    private String deptname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
