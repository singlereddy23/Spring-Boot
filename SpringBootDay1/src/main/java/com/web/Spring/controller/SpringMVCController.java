package com.web.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/kamal")	//http://localhost:8088/kamal
public class SpringMVCController
{	
	@GetMapping("/emp")	//http://localhost:8088/kamal/emp
	public ModelAndView greet()
	{
		return new ModelAndView("greeting", "msg", "Spring MVC App using SpringBoot");
	}
	
	@GetMapping("/1")	//http://localhost:8088/kamal/1
    public String Display1()
    {
        return "Hi kamal, App is Running Successfully";
    }
	
	@GetMapping("/2")	//http://localhost:8088/kamal/2
	public String Display2() {
		return "Hi Kamal, Display-2 it's Working";
	}
}