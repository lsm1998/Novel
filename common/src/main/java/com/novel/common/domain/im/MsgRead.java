/*
 * 作者：刘时明
 * 时间：2020/1/19-22:12
 * 作用：
 */
package com.novel.common.domain.im;

import lombok.Data;

import java.io.Serializable;

@Data
public class MsgRead implements Serializable
{
    private Long id;
    private Integer uid;
    private Long msgId;
    // 1已读，2删除
    private Integer status;
    // 创建时间
    private Integer createTime;
    // 更新时间
    private Integer updateTime;
}
