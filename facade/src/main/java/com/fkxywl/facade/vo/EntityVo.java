package com.fkxywl.facade.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class EntityVo implements Serializable {
    private Date createTime;

    private Date lastModifyTime;
}
