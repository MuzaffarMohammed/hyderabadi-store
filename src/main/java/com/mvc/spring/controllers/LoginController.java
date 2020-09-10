package com.mvc.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.spring.model.LoginUser;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Model model, HttpSession session) {
		session.setAttribute("title", "MHP");
		model.addAttribute("loginUser", new LoginUser());
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, HttpSession session) {
		session.setAttribute("title", "MHP");
		model.addAttribute("loginUser", new LoginUser());
		return "index";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute LoginUser loginUser, HttpSession session) {
		session.setAttribute("title", "MHP");
		
		if(loginUser.getUserName().equals("Test")) {
			return "redirect:/home";
		}else {
			return "index";
		}
		
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String login() {
		
		return "home";
	}

}
