package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class LoginController {
    @GetMapping(value="/login")
	public String loginPage(Model m){
    User user=new User();
    m.addAttribute("userInfo", user);
	return "/validation";
} 
    @PostMapping(value="/register")
    public ModelAndView submitPage(@Valid@ModelAttribute("userInfo") User user,BindingResult result){
    	 //System.out.println(user.getPassword());
    	if(result.hasErrors()){
    		return new ModelAndView("/validation");
    	}else{
    		
        ModelAndView m=new ModelAndView("/allthebest");
     	return m;
    	}
    }
}
