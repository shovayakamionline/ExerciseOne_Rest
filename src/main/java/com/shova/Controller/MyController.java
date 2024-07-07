package com.shova.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"})   // either type '/' or index
    public String showLogin()
    {
        return "inbox-page";
    }
    @GetMapping
    public String simpleMethod() {
        //mapped to hostname:port/home
        return "inbox-page";
    }
    @RequestMapping("/index")
    public String showIndex() {
        //mapped to hostname:port/home/index/
        return "inbox-page";
    }
    @RequestMapping("/home")
    public String showHome() {
        //mapped to hostname:port/home/home/
        return "home-page";
    }
}
