
public class ConstructorClasswithParamerts {
	
	int x;
	
	// "class constructor " for class ConstructorClasswithParamerts
	public ConstructorClasswithParamerts(int y) {
		
		x = y;
	}
	
	public static void main(String[] args) {
		
		ConstructorClasswithParamerts MyObj = new ConstructorClasswithParamerts(10);
		System.out.println("Value from class constructor is " + MyObj.x);
		
	}

}
