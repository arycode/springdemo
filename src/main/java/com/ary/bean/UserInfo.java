package com.ary.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserInfo {
    private Integer id;
    private String name;
    private String address;

    @JSONField(format="yyyy-MM-dd HH:mm")
    private Date birthDate;
}
