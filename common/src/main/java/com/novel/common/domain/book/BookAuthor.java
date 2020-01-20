/*
 * 作者：刘时明
 * 时间：2020/1/19-22:01
 * 作用：
 */
package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookAuthor implements Serializable
{
    private Long id;
    private Integer userId;
    private Integer bookId;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
