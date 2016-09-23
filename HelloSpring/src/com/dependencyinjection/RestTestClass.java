//Dependency Injection with Collection List
package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestTestClass {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("restaruantConfig.xml");
	
	Restaruant robj =(Restaruant) context.getBean("restaruantBean2");
	robj.displayWaitersName();
}
}
