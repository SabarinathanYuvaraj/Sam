package org.jsp.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	 @RequestMapping("/Testing/{id}/{name}")
	 @PostMapping
	public void display(@RequestParam String id,@RequestParam String name)
	{
		System.out.println(id+name);
	}
	
}
