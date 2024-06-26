package com.scm.controllers;


import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @Autowired
    private UserService userService;
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

    @GetMapping("/register")
    public String register(Model model){

        UserForm userForm = new UserForm();
//        userForm.setName("aman");
//        userForm.setAbout("This is about section :  write something about yourself");
        model.addAttribute("userForm",userForm);
        return "register";
    }

    @RequestMapping(value = "/do-register" , method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){
        System.out.println("Processing registration");
        // fetch form data
        // UserForm
        System.out.println(userForm);

        // validate form data




        // save to database

//
//         //userservice
//
////         UserForm--> User
//         User user = User.builder()
//         .name(userForm.getName())
//         .email(userForm.getEmail())
//         .password(userForm.getPassword())
//         .about(userForm.getAbout())
//         .phoneNumber(userForm.getPhoneNumber())
//         .profilePic(
//         "https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_sir.35c6cb78.webp&w=1920&q=75")
//         .build();


        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setAbout(userForm.getAbout());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setProfilePic(
                "https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_sir.35c6cb78.webp&w=1920&q=75");

        User savedUser = userService.saveUser(user);

        System.out.println("user saved :");




        return "redirect:/register";
    }

}
