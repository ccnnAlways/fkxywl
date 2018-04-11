package com.fkxywl.dubbo.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User  extends  BaseEntity{
    private Integer id;
    private String userName;
    private String password;
}
