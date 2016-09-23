//Spring Demo of Bean LifeCycle with init and destroy method using annotation & multiple bean class with getter setter method
package com.practice;

public class Student {

	private String name;
	private String Department;
	  
	public String getDepartment() {
   System.out.println("Welcome in Department: " + Department);
   return Department;
		
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public void setName(String name){
	      this.name  = name;
	   }

	   public void getName(){
	      System.out.println("Welcome " + name);
	   } 
	  
	
	}  