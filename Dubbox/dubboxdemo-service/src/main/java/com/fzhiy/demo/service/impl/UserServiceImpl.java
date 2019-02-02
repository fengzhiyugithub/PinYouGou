package com.fzhiy.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fzhiy.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getName() {
		return "fhziy";
	}
	
}
