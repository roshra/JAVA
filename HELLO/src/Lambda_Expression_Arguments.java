// Use lambda expression as argument to the method
interface StringFuncmine {
	String func(String n);
}
   public class Lambda_Expression_Arguments {
	
	// This method has a functional interface as type of its first parameter
	// Thus it can be passed a reference to any instance of that interface
	// Including instance created by lambda expression
	// stringop is a method, which can take two references
	// First reference : -> this parameter can "receive a reference" to any instance of StringFuncmine
	// including one created by lambda expression
	   
	
	static String stringop(StringFuncmine sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {

		String inStr = "Lambdas add power to java";
		String outStr;
		System.out.println("Here is input string " + inStr);
		
		// Simple lambda usage where string passed to stringop is upper case
		// first call to stringop 
	
		
		
		// 1st way 
		
		outStr = stringop((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);
		
		
		
		// 2nd way 
		
		outStr = stringop((str) -> {
			
			String result = " ";
			int i;
			for(i=0;i<str.length();i++)
			if(str.charAt(i) != ' ')
				result = result + str.charAt(i);
			return result;
			
			
		}, inStr);
		
		System.out.println("The string with spaces removed: " + outStr);
		
		
		
		
		// 3rd way 
		
		StringFuncmine reverse = (str) -> {
		String result = " ";
		int i;
		for(i= str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		return result;
			
		};
		
		System.out.println("The string is reversed " + stringop(reverse, inStr));
	}

}
