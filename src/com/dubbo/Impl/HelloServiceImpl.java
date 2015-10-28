package com.dubbo.Impl;

import com.dubbo.HelloService;

public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello"+name;
	}

}
