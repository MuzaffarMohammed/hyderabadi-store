package com.hs.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hs.model.LoginUser;
import com.hs.services.HSMenuListServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	HSMenuListServiceImpl hsmlService;
	
	public String TITLE = "";
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Model model, HttpSession session) {
		session.setAttribute("title", "Hyderabadi-Store");
		model.addAttribute("loginUser", new LoginUser());
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, HttpSession session) {
		session.setAttribute("title", "Hyderabadi-Store");
		model.addAttribute("loginUser", new LoginUser());
		return "index";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute LoginUser loginUser, HttpSession session) {
		session.setAttribute("title", "Hyderabadi-Store");
		
		if(loginUser.getUserName().equals("Test")) {
			hsmlService.getAllMenuList();
			return "redirect:/home";
		}else {
			return "index";
		}
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String login() {
		
		return "home";
	}
	
	
	@RequestMapping(value = "/menus", method = RequestMethod.GET)
	public String getMenus() {
		
		return "home";
	}

}
