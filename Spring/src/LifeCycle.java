//Bean LifeCycle with init and destroy method

public class LifeCycle {

	public void GreedEmployee(){
		System.out.println("Welcome to Organization");
	}
	

	public void init(){
		System.out.println("Demo bean is going through init");
	}

	public void destroy(){
		System.out.println("Demo bean destroy");
	}
}