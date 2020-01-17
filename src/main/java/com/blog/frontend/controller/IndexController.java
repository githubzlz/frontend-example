package com.blog.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020/1/17 10:42
 */
@Controller
public class IndexController {

    /**
     * 添加angular的所有路由
     * @return
     */
    @RequestMapping(value = {"/index","/index/blog","/index/user","/write","/write/write","/"})
    public String getIndex(){
        return "/index.html";
    }
}
