package com.demoautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");
			Animal obj = (Animal) context.getBean("animal");
			obj.display();
			
	}
}
