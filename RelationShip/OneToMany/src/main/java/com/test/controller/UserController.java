package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.User;
import com.test.service.UserService;

import java.util.*;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("user",new User());
		return "index";		
	}
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(User user) {
		userService.create(user);
		return "redirect:/list";		
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<User>user=userService.getAll();
		model.addAttribute("user",user);
		return "list";
	}
}

