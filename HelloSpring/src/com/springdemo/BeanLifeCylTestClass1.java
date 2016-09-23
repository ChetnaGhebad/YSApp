package com.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylTestClass1 {

		public static void main(String[] args){
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springdemo/BeanLifeCylConfig1.xml");
			((AbstractApplicationContext)context).registerShutdownHook();
			LifeCycle1 obj =(LifeCycle1) context.getBean("LifecycleBean1");
			obj.GreedEmployee();
		}
		}


