package com.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home page");
        model.addAttribute("name","aman");
        model.addAttribute("link","https://github.com/LearnCodeWithDurgesh/scm2.0");
        return "home";
    }

    @RequestMapping("/about")
    public  String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/service")
    public String servicePage(Model model){
        System.out.println("service page");
        return "services";
    }

    // contact page

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    // this is showing login page
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

}
