// Creates class ConstructorClass
// constructor name must match the class name, and it cannot have a return type (like void).
// constructor is called when object is created
// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you


public class ConstructorClass {
		
		int x; // creates a class attribute 

	// creates a "class constructor" for ConstructorClass
	public ConstructorClass() {
		x = 5;
		
	}
	


	public static void main(String[] args) {
		ConstructorClass myObj = new ConstructorClass();
		System.out.println("my int in class constructor is " + myObj.x);

	}

}
