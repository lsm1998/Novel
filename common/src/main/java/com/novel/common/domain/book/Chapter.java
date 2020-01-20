/*
 * 作者：刘时明
 * 时间：2020/1/19-18:53
 * 作用：
 */
package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Chapter implements Serializable
{
    private Long id;
    private Long bookId;
    private Integer sorted;
    private String name;
    private String content;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
