package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Type implements Serializable
{
    private Long id;
    private Long pid;
    private String pic;
    private String name;
    private Integer createTime;
    private Integer updateTime;
}
