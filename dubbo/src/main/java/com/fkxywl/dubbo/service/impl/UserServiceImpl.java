package com.fkxywl.dubbo.service.impl;


import com.fkxywl.common.api.bean.Result;
import com.fkxywl.dubbo.service.UserServiceBiz;
import com.fkxywl.facade.api.UserService;
import com.fkxywl.facade.vo.EntityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceBiz userServiceBiz;

    @Override
    public Result<EntityVo> test() {
        return null;
    }
}
