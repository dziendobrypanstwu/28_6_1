package com.jan._6_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
	
		Organization org = (Organization) ctx.getBean("myorg");
		
		org.corporateSlogan();
		
		((ClassPathXmlApplicationContext) ctx).close();	
		
	}
}
