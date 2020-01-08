/*
 * 作者：刘时明
 * 时间：2019/12/29-21:35
 * 作用：
 */
package com.novel.im.controller;

import com.novel.im.utils.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("hello")
    public Object hello()
    {
        return ResultUtil.success("hello");
    }
}
