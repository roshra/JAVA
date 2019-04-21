// Computes factorial of integer

interface NumbericFunc {
	
	int func(int n);
	
}
public class LambdaExpression_BlockBody {

	
	public static void main(String[] args) {
		
		// This block lambda computes the factorial of an integer value
		NumbericFunc factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++)
				result *= n;
			return result;
			
		};
	
		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 5 is " + factorial.func(5));
		
	}
}
