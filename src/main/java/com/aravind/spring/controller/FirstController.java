package com.aravind.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(path="/hi")
	public String sayHiAravind()
	{
		return "Hi Aravind";
	}

}
