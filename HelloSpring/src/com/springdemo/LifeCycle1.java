//Bean LifeCycle with initialization and disposableBean interface
package com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle1 implements InitializingBean,DisposableBean{

	public void GreedEmployee(){
		System.out.println("Welcome to Organization");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LifeCycle Bean is going through AfterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("LifeCycle Bean isDestroy Now");
		
	}
	
}