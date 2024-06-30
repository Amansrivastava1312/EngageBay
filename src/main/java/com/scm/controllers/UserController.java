package com.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {


    //user dashboard
    @RequestMapping(value = "/dashboard" ,method = RequestMethod.GET)
    public String userDashboard(){
        System.out.println("userdash");
        return "user/dashboard";
    }


    //add contact page




    //view contact page



    //edit contact


    //delete contact



    //user search



}
