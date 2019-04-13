class person {
	String fname = "rosh" ;
	String lname = "ravi";
	int age = 37;
	
}

public class Multiple_Attributes_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person multipleobj = new person();
		System.out.println("Name: " + multipleobj.fname + " \n" + "Last Name: " + multipleobj.lname + "\n");
		System.out.println("age: " + multipleobj.age + "\n");
	}

}
