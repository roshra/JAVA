// class name is CarMethod
// class carMethod has two methods 
// methods are fullThrottle
// and speed method which accepts int parameter maxSpeed
// you create an object myCar to access both public methods
// https://www.w3schools.com/java/java_class_methods.asp


public class CarMethod {

	// public method fullThrottle
	public void fullThrottle() {
		System.out.println("The car is at full throttle \n");
	}
	
	// public method speed
	public void speed(int maxSpeed) {
		System.out.println("The max speed is " + maxSpeed);
	}
	
	public static void main(String[] args) {
		
		CarMethod myCar = new CarMethod();
		myCar.fullThrottle();
		myCar.speed(150);

	}

}
