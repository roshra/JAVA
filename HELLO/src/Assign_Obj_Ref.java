// Assign Object Reference Variable
// We will see how we can assign two object pointing to same variable
// Both b1 and b2 are pointing to height

class Box {
	
	double width;
	double height;
	double depth;
}

public class Assign_Obj_Ref {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Assigning new object b1	
	Box b1 = new Box();
	// Assigning b2 to b1
	Box b2 = b1;
	
	// height VIA objects b1 and b2
	System.out.println(b1.height);
	System.out.println(b2.height);
	
	// Changing height parameter
	b1.height = 20;
	
	// height VIA b1 and b2 post modification 
	System.out.println("height VIA b1 and b2 post modification");
	System.out.println(b1.height);
	System.out.println(b2.height);
	
	}

}
