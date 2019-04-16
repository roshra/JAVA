
public class ConstructorClassCar {
	
	String modelName;
	int modelYear;
	
	public ConstructorClassCar(int year,String name) {
		modelName = name;
		modelYear = year;
	}

	public static void main(String[] args) {
		ConstructorClassCar myObj = new ConstructorClassCar(1969, "Mustang");
		System.out.println("ModelYear = " + myObj.modelYear + " " + "ModelName = " + myObj.modelName);
		

	}

}
