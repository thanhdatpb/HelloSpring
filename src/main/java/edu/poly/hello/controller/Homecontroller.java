package edu.poly.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("home")
    public String index(){
        return "index";
    }
}
