//Bean LifeCycle with init and destroy method using annotation & multiple bean class

package com.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycle {

	public void GreedEmployee(){
		System.out.println("Welcome to Organization");
	}
	
	@PostConstruct                  //using annotation
	public void init(){
		System.out.println("Demo bean is going through init");
	}
	@PreDestroy                    //using annotation
	public void destroy(){
		System.out.println("Demo bean destroy");
	}
}