package block.examples;

public class Example1 {

	final static int age;
	final double salary;	
	Example1(){
		System.out.println("I am Blocks9 class cons...");
	}
	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		Example1 b1 = new Example1();
		System.out.println("main() ends..");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		print();
	}
	static {
		age =25;
		
	}
}