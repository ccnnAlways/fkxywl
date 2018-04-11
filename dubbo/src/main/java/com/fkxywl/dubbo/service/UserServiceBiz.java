package com.fkxywl.dubbo.service;

import com.fkxywl.common.core.manager.BaseManager;
import com.fkxywl.dubbo.dao.mapper.UserMapper;
import com.fkxywl.dubbo.dao.repository.UserRepository;
import com.fkxywl.dubbo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBiz extends BaseManager<User, Integer> {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.repository = userRepository;
    }
}
