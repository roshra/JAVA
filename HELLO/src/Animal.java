//Interface 
public interface Animal {
	
	public void animalSound(); 	// interface method (does not have a body)
	public void sleep(); 		// interface method (does not have a body)

}


// ping implements the animal interface
class pig implements Animal {
	
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The ping says wee wee wee \n");
	}
	
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzzz");
	}
}

class MyMainClass {
public static void main(String[] args) {
	
	pig MyPig = new pig();   // Create a pig object
	MyPig.animalSound();
	MyPig.sleep();
 
	}

}
