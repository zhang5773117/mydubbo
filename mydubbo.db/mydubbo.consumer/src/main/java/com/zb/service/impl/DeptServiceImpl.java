package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zb.entity.Dept;
import com.zb.service.DeptService;
import com.zb.service.RpcDeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Reference(version = "2.0.0")
    private RpcDeptService rpcDeptService;

    @HystrixCommand
    @Override
    public List<Dept> findDeptList() {
        if(Math.random()*10>=5){
            throw new RuntimeException("自定义异常");
        }
        return rpcDeptService.findDeptList();
    }
}
