package com.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylTestClass {

		public static void main(String[] args){
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springdemo/BeanLifeCylConfig.xml");
			((AbstractApplicationContext)context).registerShutdownHook();
			LifeCycle obj =(LifeCycle) context.getBean("LifecycleBean");
			obj.GreedEmployee();
		}
		}


