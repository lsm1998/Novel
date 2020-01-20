/*
 * 作者：刘时明
 * 时间：2020/1/19-21:58
 * 作用：
 */
package com.novel.common.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class Recharge implements Serializable
{
    private Long id;
    private Integer uid;
    private Long amount;
    private Integer type;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
