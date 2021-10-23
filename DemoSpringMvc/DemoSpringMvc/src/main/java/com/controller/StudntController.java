package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class StudntController {
	
	
	@RequestMapping(value="/hi")
     public String greet() {
		System.out.println("HomeController : Passing......");
    	 return "welcome";
     }
	//@RequestMapping(value="/add", method=RequestMethod.POST) 
	@GetMapping(value="/add")
	public String AddStudent(@RequestParam("t1")  String name, @RequestParam("t2") String p ,Model m )
	{
		m.addAttribute("user", name);
		m.addAttribute("pass", p);
		return "StudView";
	}
	@RequestMapping(value="/")
	public String Startpage() {
	return "AddStud";	
	}
}
