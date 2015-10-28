
package com.dubbo.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.HelloService;

public class provider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "provider.xml" });
		context.start();

		

		System.in.read();
	}

}