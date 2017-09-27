package net.chinanets.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request){

        request.setAttribute("key", "hello world");

        return "welcome";
    }
    
}