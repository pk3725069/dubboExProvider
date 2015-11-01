
package com.dubbo.Impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class provider {

	  public static void main(String[] args) throws Exception {
//	        String config = provider.class.getPackage().getName().replace('.', '/') + "/provider.xml";
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
	        context.start();
	        System.in.read();
	    }

}