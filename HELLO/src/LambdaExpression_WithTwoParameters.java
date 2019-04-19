// interface
interface NumaricTest2 {
	boolean test(int n, int d);
}

public class LambdaExpression_WithTwoParameters {

	public static void main(String[] args) {
		// lambda expression
		NumaricTest2 isFactor = (n,d) -> (n%d) == 0;
		
		if(isFactor.test(10, 2)) System.out.println("2 is factor of 10 \n");
		if(!isFactor.test(10, 3)) System.out.println("3 is not a factor is 10 \n");
		

	}

}
