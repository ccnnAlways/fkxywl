package com.fkxywl.dubbo.service.impl;


import com.fkxywl.dubbo.entity.BaseEntity;
import com.fkxywl.dubbo.service.HelloServiceBiz;
import com.fkxywl.facade.api.HelloService;
import com.fkxywl.facade.vo.EntityVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloServiceBiz helloServiceBiz;

    @Override
    public EntityVo test() {
        BaseEntity test = helloServiceBiz.test();
        EntityVo vo = new EntityVo();
        BeanUtils.copyProperties(test,vo);
        return vo;
    }
}
