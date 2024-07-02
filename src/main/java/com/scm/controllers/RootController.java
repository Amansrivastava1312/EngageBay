package com.scm.controllers;

import com.scm.entities.User;
import com.scm.helpers.Helper;
import com.scm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class RootController {


    @Autowired
    private UserService userService;

    @ModelAttribute
    public void addLoggedInUSerInformation(Model model, Authentication authentication ){
        if(authentication==null){
            System.out.println("user not logged in");
            return;
        }
        //here or username is email
        String username = Helper.getEmailOfLoggedInUser(authentication);

        User user = userService.getUserByEmail(username);
        System.out.println(user.getName());
        System.out.println("user.getName()");

        model.addAttribute("loggedInUser",user);
    }
}
