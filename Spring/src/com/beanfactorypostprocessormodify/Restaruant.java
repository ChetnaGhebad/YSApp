//custom BeanFactoryPostProcessor to modify the value in configuration file
package com.beanfactorypostprocessormodify;

public class Restaruant {

	String welcomenote;

	public void setWelcomenote(String welcomenote) {
		this.welcomenote = welcomenote;
	}
	public void GreedCustomer(){
		System.out.println(welcomenote);
	}
	
}
