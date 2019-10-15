package com.hui.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/9
 */
@Controller
public class TestPageController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/details")
    public String details(){
        return "details";
    }
    @RequestMapping("/leacots")
    public String leacots(){
        return "leacots";
    }
    @RequestMapping("/whisper")
    public String whisper(){
        return "whisper";
    }
    @RequestMapping("/album")
    public String album(){
        return "album";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
