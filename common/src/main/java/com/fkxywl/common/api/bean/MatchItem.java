package com.fkxywl.common.api.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ssr on 2017/3/14.
 */
@Getter
@Setter
public class MatchItem {
    private String property;
    private Object value;
    private MatchType matchType;

    public static MatchItem instance(String property, Object value, MatchType matchType) {
        return new MatchItem(property, value, matchType);
    }
    public MatchItem(String property, Object value, MatchType matchType) {
        this.property = property;
        this.value = value;
        this.matchType = matchType;
    }

    @Override
    public String toString() {
        return "MatchItem{" +
                "property='" + property + '\'' +
                ", value=" + value +
                ", matchType=" + matchType +
                '}';
    }
}
