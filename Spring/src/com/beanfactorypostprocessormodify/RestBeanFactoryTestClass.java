package com.beanfactorypostprocessormodify;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class RestBeanFactoryTestClass {

			public static void main(String[] args){
				ApplicationContext context = new ClassPathXmlApplicationContext("com/beanfactorypostprocessormodify/RestConfig.xml");
				((AbstractApplicationContext)context).registerShutdownHook();
				Restaruant obj =(Restaruant) context.getBean("restBean");
				obj.GreedCustomer();
			}
			}


