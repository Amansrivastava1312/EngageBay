package com.scm.controllers;


import com.scm.entities.User;
import com.scm.helpers.Helper;
import com.scm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;



    //user dashboard
    @RequestMapping(value = "/dashboard" ,method = RequestMethod.GET)
    public String userDashboard(){
        System.out.println("userdash");
        return "user/dashboard";
    }

    @RequestMapping(value = "/profile" ,method = RequestMethod.GET)
    public String userProfile(Model model, Authentication authentication){

        return "user/profile";
    }


    //add contact page




    //view contact page



    //edit contact


    //delete contact



    //user search



}
