// interface 
interface firstInterface {
	
	//interface method 
	public void firstMethod();
	
}

// interface
interface secondInterface {
	
	//interface method
	public void secondMethod();	
}


class DemoClass implements firstInterface, secondInterface {
	
	public void firstMethod() {
		
		System.out.println("You are in firstMethod \n");
		
	}
	
	public void secondMethod() {
		
		System.out.println("You are in secondMethod \n");
	}
}


public class Multiple_Interfaces {

	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.firstMethod();
		myObj.secondMethod();

	}

}
