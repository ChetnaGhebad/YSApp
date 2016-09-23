package com.practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCylTestClass {

		public static void main(String[] args){
			ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/BeanLifeCylConfig.xml");
			((AbstractApplicationContext)context).registerShutdownHook();
			LifeCycle obj =(LifeCycle) context.getBean("LifecycleBean");
	
			Student st =(Student) context.getBean("LifecycleBean1");
			obj.GreedEmployee();
			st.getName();
			st.getDepartment();
		}
		}


