package variable.example;

public class VariableTypes1 {
	static int empId= 2003;
	static double salary;

	public static void main(String[] args) {
	System.out.println("program starts");
	//local variable
	int age=25;
	System.out.println("Local variable:" +age);
	//accessing global variables
	System.out.println("static global variable salary:" +empId);
	System.out.println("static global variable:" +salary);
	 
	//accessing global variable with class name
		System.out.println("SGV empId:" +VariableTypes1.empId);
		System.out.println("SGV empId:" +VariableTypes1.salary); 
		
	//change the value	
		empId=1001;
		salary=2500.34;
		System.out.println("SGV empId:" +VariableTypes1.empId);
	    System.out.println("SGV empId:" +VariableTypes1.salary);
	    
}
	
	}


