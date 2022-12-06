package com.springmvctask.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvctask.entity.UserDetails;
import com.springmvctask.repository.UserDetailsRepository;

@Controller
public class UserDetailsController {
	@Autowired
	private UserDetailsRepository userdetailsRepository;

	public UserDetailsController() {
		System.out.println("Home controller constructor");
	}

	@RequestMapping("/")
	public String greet() {
		System.out.println("greet");
		return "index";
	}

	@RequestMapping("register")
	public String registerUser() {
		System.out.println("register");
		return "register";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/login")
	public String loginUser(@RequestParam(required = false) String errormsg, Map<String, String> map) {
		if (errormsg != null)
			map.put("errormsg", errormsg);
		System.out.println("login");
		return "login";
	}

	@PostMapping("/register")
	public String insertUser(UserDetails user) {
		System.out.println("insert post");
		System.out.println(user);
		if (user.getUsername() != null && user.getEmail() != null && user.getPassword() != null) {
			userdetailsRepository.userRegister(user);
			return "login";
		}
		return "register";
	}

	@PostMapping("/login")
	public String validateUser(UserDetails user, Map<String, String> map, HttpSession session) {
		System.out.println("login post");
		System.out.println(user);
		if (userdetailsRepository.validateUser(user)) {
			session.setAttribute("email", user.getEmail());
			return "dashboard";
		}
		map.put("email", user.getEmail());
		return "redirect:login?errormsg= invalid details...???";
	}

}