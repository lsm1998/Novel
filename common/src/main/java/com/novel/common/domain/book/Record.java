/*
 * 作者：刘时明
 * 时间：2020/1/19-22:07
 * 作用：
 */
package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Record implements Serializable
{
    private Long id;
    private Integer uid;
    private Long bookId;
    private Long chapterId;
    private Integer page;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
