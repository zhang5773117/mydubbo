package com.zb.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zb.entity.Dept;
import com.zb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "show_fallback")
    @GetMapping(value = "/show")
    public List<Dept> show() {
        return deptService.findDeptList();
    }

    public List<Dept> show_fallback() {
        List<Dept> list = new ArrayList<>();
        Dept dept = new Dept();
        dept.setId(1);
        dept.setDeptname("test");
        list.add(dept);
        return list;
    }

}
