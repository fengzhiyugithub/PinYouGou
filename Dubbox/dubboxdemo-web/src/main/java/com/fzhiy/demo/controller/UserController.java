package com.fzhiy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fzhiy.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Reference //alibaba�ṩ������ע�⣬ʵ������Զ�ˣ� ����ʹ��Autowired!
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName() {
		return userService.getName();
	}
	
}
