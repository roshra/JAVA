// Static Method and Public Method
// Static methods can be accessed by without an object 
// Public method can only be accessed by object
 
public class Public_Static_Method {

	static void myStaticMethod() {
		
		System.out.println("Static method can be called without creating object \n");
	}
	
	public void myPublicMethod() {
		System.out.println("Public method can be called with only creating object \n");
	}	
	
	
	public static void main(String[] args) {

		myStaticMethod();
		
		Public_Static_Method PublicObj = new Public_Static_Method();
		PublicObj.myPublicMethod();	
		
	}

  }

