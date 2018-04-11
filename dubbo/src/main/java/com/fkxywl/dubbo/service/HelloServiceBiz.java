package com.fkxywl.dubbo.service;

import com.fkxywl.dubbo.entity.BaseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("helloServiceBiz")
public class HelloServiceBiz {

    public BaseEntity test(){
        BaseEntity entity= new BaseEntity();
        entity.setCreateTime(new Date());
        entity.setLastModifyTime(new Date());
        return entity;
    }
}
