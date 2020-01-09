/*
 * 作者：刘时明
 * 时间：2020/1/9-10:45
 * 作用：
 */
package com.novel.user.service.impl;

import com.novel.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Override
    public String hello(String name)
    {
        return String.format("你好啊，%s", name);
    }
}
