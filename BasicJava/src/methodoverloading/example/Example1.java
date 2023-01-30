package methodoverloading.example;

public class Example1 {

	public void square() {
		System.out.println("No parameter Method called");
	}
	public void square(int number) {
		int square= number*number;
		System.out.println("Method with integer argument called" +square);
	}
	public void square(float number) {
		float square= number*number;
		System.out.println("Method with float argument called" +square);
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.square(2.5f);
		obj.square();
		obj.square(10);

	}

}
