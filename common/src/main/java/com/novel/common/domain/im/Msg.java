/*
 * 作者：刘时明
 * 时间：2020/1/9-23:42
 * 作用：
 */
package com.novel.common.domain.im;

import lombok.Data;

import java.io.Serializable;

@Data
public class Msg implements Serializable
{
    // 消息ID
    private int id;
    // 消息命令，0ACK确认，1握手，2私聊，3群发，4系统消息，5系统广播
    private int cmd;
    // 消息长度
    private int len;
    // 发送者ID
    private int formId;
    // 接收者ID
    private int toId;
    // 消息内容
    private String content;
    // 是否删除
    private Integer status;
    // 创建时间
    private Integer createTime;
    // 更新时间
    private Integer updateTime;
}
