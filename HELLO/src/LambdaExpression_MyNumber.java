interface MyNumber {
	double getValue();
}


public class LambdaExpression_MyNumber {

	public static void main(String[] args) {
	

		// Creates a reference to MyNumber
		MyNumber myNum;

		// Use lambda expression in assignment context 
		myNum = () -> 123.45; 
		
		// Now call getValue() by previously assigned lambda expression
		
		System.out.println("A fixed value: " + myNum.getValue());
		
		// Here more complex expression is used
		myNum = () -> Math.random() * 100;
		
		// These call the lambda expression in the previous line
		System.out.println("A random value: " + myNum.getValue());
		System.out.println("A random value: " + myNum.getValue());
		
		// A lambda expression must be compatible with the method defined by functional interface 
		// If we give a string "any word" since at getValue is double the code will fail compile
		// if you give a double, it should work fine
		// if you give an integer , it will also work fine
        myNum = () -> 12;
        System.out.println("A new value of int is referenced to the getValue() method: " + myNum.getValue());
	
	}

}
