package com.alex.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alex.service.IUserService;

@Controller
public class WebController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listUser(Model model) {
		model.addAttribute("listUser", userService.getAllUser());
        return "user";
    }
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public String user(@PathVariable("userId") String userId, Model model) {
		model.addAttribute("user", userService.getUser(Long.parseLong(userId)));
        return "user";
    }
	

}
