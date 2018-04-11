package com.fkxywl.common.api.bean;


import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Setter
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 主键. */
    private Integer id;

    /** 乐观锁. */
    private Integer version;

    /** 创建时间，默认当前时间. */
    private Date createTime;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    @Column(updatable = false, insertable = false, columnDefinition="timestamp DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", version=" + version +
                ", createTime=" + createTime +
                '}';
    }
}
