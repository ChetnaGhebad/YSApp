package com.demoautowiring;

public class Animal {
Cat c;
Dog d;
public Dog getD() {
	return d;
}

public void setD(Dog d) {
	this.d = d;
}

public Cat getC() {
	return c;
}

public void setC(Cat c) {
	this.c = c;
}
public void display()
{

	System.out.println("The "+c.getName()+" has "+"color "+c.getColor());
	System.out.println("The "+d.getName()+" has "+"color "+d.getColor());
}
}
