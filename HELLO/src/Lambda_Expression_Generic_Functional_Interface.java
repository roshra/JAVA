interface SomeFunc<T>{
	T func(T t);
}

public class Lambda_Expression_Generic_Functional_Interface {

	public static void main(String[] args) {
		// Lambda expression string based version
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			for(int i = str.length()-1; i >=0; i--)
				result = result + str.charAt(i);
			return result;
			
		};

		System.out.println("Lambda reverse is " + reverse.func("GEETHIKA"));
		
		// Lambda expression integer based version of SomeFunc
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for(int i = 1; i <=n; i++)
				result = result * i;
			return result;
		};
		
		System.out.println("Lambda factorial is " + factorial.func(5));
	}

}
