package constructor.examples;

public class Example2 {
	Example2(double d){
		this(10);
		System.out.println("double:"+d);
	}
    Example2(int i){
    	this();
    	System.out.println("Int:"+i);
    }
    Example2(){
    	System.out.println("Blank");
    }
	public static void main(String[] args) {
		Example2 e1=new Example2(11.2);
		System.out.println("*********");
		Example2 e2=new Example2(2);
		System.out.println("*********");
		Example2 e3=new Example2();
		System.out.println("*********");

	}

}
