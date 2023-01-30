package variable.example;

public class VariableTypes2 {

		int empId=1001;
		double salary;
		public static void main(String[] args) 
		{
			System.out.println("Program Starts");
			//local variable
			int age=15;
			System.out.println("Local Variable age: "+age);
			/* Creating an instance/object to access non-static members of the class*/
			/* 
			NonStaticGlobalVariableExample1 n1;
			n1 = new NonStaticGlobalVariableExample1();
			*/
			VariableTypes2 n1 = new VariableTypes2();
			System.out.println("NSGV empId: "+n1.empId); 
			System.out.println("NSGV salary: "+n1.salary);
			System.out.println("****************Updated NSGV***********************");
			n1.empId=5001;
			n1.salary=45222.655;
			System.out.println("NSGV empId: "+n1.empId); 
			System.out.println("NSGV salary: "+n1.salary);
			System.out.println("****************New Object NSGV***********************");
			VariableTypes2 n2 = new VariableTypes2();
			System.out.println("n2: NSGV empId: "+n2.empId); 
			System.out.println("n2: NSGV salary: "+n2.salary);
			System.out.println("Program Ends"); 
			
			n1.empId=3456;
			n1.salary=342.22;
			System.out.println("n1: NSGV empId: "+n1.empId); 
			System.out.println("n1: NSGV salary: "+n1.salary);
			System.out.println("Program Ends");

	}

}
