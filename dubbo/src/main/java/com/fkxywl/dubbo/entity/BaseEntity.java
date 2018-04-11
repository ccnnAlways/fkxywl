package com.fkxywl.dubbo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseEntity implements Serializable {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastModifyTime;
}
