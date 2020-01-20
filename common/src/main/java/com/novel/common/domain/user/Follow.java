/*
 * 作者：刘时明
 * 时间：2020/1/19-21:55
 * 作用：
 */
package com.novel.common.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class Follow implements Serializable
{
    private Long id;
    private Integer followId;
    private Integer fansId;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
