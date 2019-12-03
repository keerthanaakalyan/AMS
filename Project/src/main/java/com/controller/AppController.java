package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.model.User;
import com.service.UserService;

@Controller
public class AppController {
	@Autowired
	private UserService userService;
	//@RequestMapping(value="/welcome1",method=RequestMethod.GET)
	@GetMapping(value="/welcome1")
     public String method1(){
    	 return "/Success";
     }
	@RequestMapping(value="/welcome2",method=RequestMethod.POST)
    public String method2(Model model,@ModelAttribute User user){
	 //Employee employee=new Employee(12345,param);
	 //System.out.println(pwd);
	 model.addAttribute("model", user);
	 return "/emp";
    }
	//@RequestMapping(value="/welcome3",method=RequestMethod.POST)
     @PostMapping(value="/welcome3")
	public ModelAndView method3(@ModelAttribute User user){
	 //Employee employee=new Employee(12345,param);
	 //System.out.println(pwd);
	 //model.addAttribute("model", user);
    	 User userobj=userService.readUserById(user.getUserId());
    	System.out.println("ppp"+userobj.getUserId()); 
	 ModelAndView m= new ModelAndView("/emp");
	 m.addObject("user1", userobj);
	 return m;
    	// return new ModelAndView("/emp",userobj);
    }
     @GetMapping(value="/meth/{alias}")
     public String meth( Model m,@PathVariable("alias") int age){
    	 System.out.println("My age is :"+age);
    	
    	 m.addAttribute("u",age);
    	 return "/Success";
     }
}
