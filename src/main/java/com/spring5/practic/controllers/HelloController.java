package com.spring5.practic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring5.practic.model.User;
import com.spring5.practic.services.UserServices;

@Controller
public class HelloController {

	@Autowired
	private UserServices userService;
//	private User user;
	
	@GetMapping("show-all")
	public String hello(Model model) {
		model.addAttribute("message", "Showing all user");
		userService.showAll();
		return "index";
	}
	
	@GetMapping("add-user")
	public String add(@RequestParam("name") String name, Model model) {
		userService.creatUser(name);
		model.addAttribute("message", "User creat Successfully");
		return "index";
	}
	@GetMapping("remove-user")
	public String remove(@RequestParam("name") String name, Model model) {
		userService.removeUserByName(name);;
		model.addAttribute("message", "User Remove Successfully");
		return "index";
	}
	
//	@GetMapping("hello")
//	public String hello(Model model) {
//		model.addAttribute("user",user);
//		return "index";
//	}
//	
//	@GetMapping("hello")
//	public String hello() {
//		return "index";
//	}
//	
//	@GetMapping("hello2")
//	public String hello(@RequestParam("name") String name, Model model) {
//		user.setName(name);
//		model.addAttribute("user", user);
//		return "index";
//	}
	

	


}
