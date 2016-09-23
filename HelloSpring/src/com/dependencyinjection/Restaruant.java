//Dependency Injection with Collection List
package com.dependencyinjection;

import java.util.List;

public class Restaruant {
 private List restaruantWaitersList;


public List getRestaruantWaitersList() {
	return restaruantWaitersList;
}


public void setRestaruantWaitersList(List restaruantWaitersList) {
	this.restaruantWaitersList = restaruantWaitersList;
}


public void displayWaitersName(){
	System.out.println("Waiters Name:"+ restaruantWaitersList);
}
}
