package com.springbootmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootmvc.entity.User;
import com.springbootmvc.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String greet() 
	{
		return "index";
	}
	
	
		@RequestMapping("register")
		public String registerUser()
		{
		return "register";	
		}

		@RequestMapping("login")
		public String loginUser()
		{
			return "login";
		}
		
		 @RequestMapping("/index")
	        public String logout()
		 {

	            return "index";
	        }
		
		@GetMapping("/dashboard")
		public String dashboard()
		{
			return "dashboard";
		}
		
		@GetMapping("/update")
		public String userUpdate()
		{
			return "update";
		}
		
		@GetMapping("/dahshboard2")
		public String updateDashboard()
		{
			return "dahshboard2";
		}
		
		@PostMapping("/register")
		public String registerUser(User user)
		{
			
			if (user.getUserName() != null && user.getPassword() != null && user.getName() != null
					&& user.getEmail() != null && user.getContact() != null &&user.getAddress() != null ) 
			{
				userService.registerUser(user);
				return "login";
		    }
		
				return "register";
		}
		
		@PostMapping("/login")
		public String validateUser(User user, Map<String, String> map, HttpSession session) {
			if (userService.validateUser(user)) 
			{
				User us= this.userService.getUser(user.getUserName());
				session.setAttribute("name", us.getName());
				return "redirect:dashboard";
			}
			map.put("name", user.getName());
			return "redirect:login?errormsg= invalid credentails";
		}
	
		@PostMapping("/update")
		public String userUpdate(User user)
		{
			userService.userUpdate(user.getUserName(), user.getEmail(), user.getContact(), user.getAddress());
			
			return "redirect:dahshboard2?msg=inforammtion succesfully updated";
			
		}
}
