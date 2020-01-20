/*
 * 作者：刘时明
 * 时间：2020/1/19-21:53
 * 作用：
 */
package com.novel.common.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class Collection implements Serializable
{
    private Long id;
    private Integer uid;
    private Integer type;
    private Long bookId;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
