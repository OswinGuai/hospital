package com.loooz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.loooz.bo.User;
import com.loooz.service.UserService;

@Controller
public class GatewayController {
	
	@Resource
	private UserService userService;

	@RequestMapping(value = "/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		System.out.println("test---------------");
		mv.addObject("spring", "spring mvc");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "/user_{aid}", method = RequestMethod.GET)
	public ModelAndView getUserById(@PathVariable("aid") String aid) {
		ModelAndView mv = new ModelAndView();
		User user = userService.getUserByAid(aid);
		System.out.println("test---------------" + aid);
		System.out.println("test---------------" + user.getName());
		System.out.println("test---------------" + user.getCellphone());
		mv.addObject("spring", "spring mvc");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "/json/{aid}", method = RequestMethod.GET)
	public @ResponseBody User hiJson(@PathVariable("aid") String aid) {
		User user = userService.getUserByAid(aid);
		System.out.println("test---------------");
		return user;
	}

}