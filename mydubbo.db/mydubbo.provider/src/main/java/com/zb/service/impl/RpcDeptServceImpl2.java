package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Dept;
import com.zb.mapper.DeptMapper;
import com.zb.service.RpcDeptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "2.0.0")
public class RpcDeptServceImpl2 implements RpcDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findDeptList()
    {
        System.out.println("版本2----------------------");
        return deptMapper.findDept();
    }
}
