package com.novel.common.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDetails implements Serializable
{
    private Integer uid;
    private String headImg;
    private String phone;
    private Integer loginType;
    private Integer birthday;
    private String region;
    private String nation;
    private String autograph;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
