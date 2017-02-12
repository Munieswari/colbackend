package com.niit.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String index()
	{
		System.out.println("Iam from Controller");
		return "index";
	}   
   
}
