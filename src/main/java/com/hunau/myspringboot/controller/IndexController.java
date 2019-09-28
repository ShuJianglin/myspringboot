package com.hunau.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("hello")
public class IndexController {
    @RequestMapping("123")
    public String index() {
        return "index";
    }

    @RequestMapping("1232")
    @ResponseBody
    public String index2() {
        return "湖南省常德市";
    }

}
