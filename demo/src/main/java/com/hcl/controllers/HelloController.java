package com.hcl.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	@RequestMapping(value="/",method = RequestMethod)
	public String printHello()
	{
		 return "hello";
	}
	

}
