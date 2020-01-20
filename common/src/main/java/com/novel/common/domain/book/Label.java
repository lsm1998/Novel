/*
 * 作者：刘时明
 * 时间：2020/1/19-22:08
 * 作用：
 */
package com.novel.common.domain.book;

import lombok.Data;

import java.io.Serializable;

@Data
public class Label implements Serializable
{
    private Long id;
    private String name;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
