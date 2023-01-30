package constructor.examples;
//constructor example
public class Example1 {
	String name;
	int rollno;
	 Example1 (String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;	
	}

	public static void main(String[] args) {
		Example1 e1=new Example1("Pranjali", 101);
		Example1 e2=new Example1("Sakhi", 102);
		Example1 e3=new Example1("Mrunali", 103);
		
		System.out.println(e1.name + ":" +e1.rollno);
		System.out.println(e2.name+ ":" +e2.rollno);
		System.out.println(e3.name+ ":" +e3.rollno);

	}

}
