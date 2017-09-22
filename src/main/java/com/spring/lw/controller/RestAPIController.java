package com.spring.lw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.lw.service.IUserService;
import com.spring.lw.vo.User;

@Controller
public class RestAPIController {
	@Autowired
	private IUserService userService ;
	
	@RequestMapping("/hello")
    public @ResponseBody String test() {
        return "Spring MVC...";
    }
	
	@RequestMapping("/getUser/{userId}")
	public @ResponseBody String getUser(@PathVariable String userId){
		User user = userService.getUser(Integer.parseInt(userId));
		
		return user == null ? "Can't find..." : user.toString();
	}
}
