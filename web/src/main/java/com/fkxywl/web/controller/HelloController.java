package com.fkxywl.web.controller;

import com.fkxywl.facade.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/{user}", method= RequestMethod.GET)
    public String hello(@PathVariable String user){
        return helloService.test().toString();
    }
}
