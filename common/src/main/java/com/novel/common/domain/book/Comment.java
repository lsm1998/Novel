package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Comment implements Serializable
{
    private Long id;
    private Integer uid;
    private String content;
    private Long bookId;
    private Long replyId;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
