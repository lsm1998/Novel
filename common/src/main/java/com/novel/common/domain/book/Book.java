package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable
{
    private Long id;
    private Long typeId;
    private String title;
    private String synopsis;
    private String cover;
    private Integer recommend;
    private Integer click;
    private Integer collection;
    private Integer instalments;
    private Long wordNum;
    private Integer createTime;
    private Integer updateTime;
}
