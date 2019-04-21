// Block lambda that reserves the characters in a string

interface StringFunc {
	
	String func(String n);
}

public class LambdaExpression_String_Reverse {

	public static void main(String[] args) {
		// lambda body
		
		StringFunc reverse = (str) ->  {
			System.out.println(str);
			System.out.println(str.length());
			
			String result = " ";
			int i;
			for(i=str.length()-1; i >=0; i--) 
				result += str.charAt(i);      // The charAt() method returns the character at the specified index in a string.
			return result;
			
		};
		
		
		System.out.println("Lambda reversed is " + reverse.func("GEETHIKA"));

	}

}
