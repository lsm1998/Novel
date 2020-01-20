/*
 * 作者：刘时明
 * 时间：2020/1/19-21:56
 * 作用：
 */
package com.novel.common.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable
{
    private Long id;
    private Integer uid;
    private Long accountBalance;
    private Long monthlyBalance;
    private Long recommendBalance;
    private Integer status;
    private Integer createTime;
    private Integer updateTime;
}
