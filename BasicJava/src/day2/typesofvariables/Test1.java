package day2.typesofvariables;

public class Test1 {

	public static void main(String[] args) {
	System.out.println("Program starts");
	//Area = pi*r*r;
	int r= 40, pi= 22/7, area= pi*r*r;
	System.out.println("r="+r); 
	System.out.println("area+"+area);
	System.out.println("Program ends");
	}

}
class Test2 {

	public static void main(String[] args) {
	System.out.println("Program starts");
	//Area = pi*r*r;
	double r= 70.0, pi= 3.14, area= pi*r*r;
	System.out.println("r="+r); 
	System.out.println("area+"+area);
	System.out.println("Program ends");
	}

}
class Test3 { 
//non static global variable
	int empId= 2001;
	double salary;
	public static void main(String[] args) {
	Test3 n1=new Test3();
	System.out.println("NSGV empId:"+n1.empId);
	System.out.println("NSGV salary:"+n1.salary); 
	}

}
