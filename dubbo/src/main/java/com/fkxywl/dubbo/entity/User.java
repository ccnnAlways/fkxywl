package com.fkxywl.dubbo.entity;

import com.fkxywl.common.api.bean.BaseEntity;
import com.fkxywl.common.api.bean.MatchType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class User extends BaseEntity {
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    private Boolean locked;
    private Long orderNum;
    private Double money;
    private BigDecimal fee;
    private Date birthday;
    private MatchType matchTypeId;
    private MatchType matchTypeName;
    private String comment;

    private String xxx;

    @Column(columnDefinition="tinyint(1) NOT NULL DEFAULT '0'")
    public Boolean getLocked() {
        return locked;
    }

    @Temporal(TemporalType.DATE)
    public Date getBirthday() {
        return birthday;
    }

    @Enumerated(EnumType.ORDINAL)
    public MatchType getMatchTypeId() {
        return matchTypeId;
    }

    @Enumerated(EnumType.STRING)
    public MatchType getMatchTypeName() {
        return matchTypeName;
    }

    @Lob
    public String getComment() {
        return comment;
    }

    @Transient
    public String getXxx() {
        return xxx;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", locked=" + locked +
                ", orderNum=" + orderNum +
                ", money=" + money +
                ", fee=" + fee +
                ", birthday=" + birthday +
                ", matchTypeId=" + matchTypeId +
                ", matchTypeName=" + matchTypeName +
                ", comment='" + comment + '\'' +
                ", xxx='" + xxx + '\'' +
                '}';
    }
}
