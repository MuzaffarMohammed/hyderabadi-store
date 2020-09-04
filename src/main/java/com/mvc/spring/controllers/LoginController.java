package com.mvc.spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.spring.model.LoginUser;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, HttpSession session) {
		session.setAttribute("title", "MHP");
		model.addAttribute("loginUser", new LoginUser("Muzaffar", "test123"));
		return "login";
	}

}
