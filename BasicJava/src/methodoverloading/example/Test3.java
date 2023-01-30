package methodoverloading.example;

public class Test3 
{
	void mem(float a, int b) {
		System.out.println("Method A");
	}
	
	void mem(int a, double b, double c) {
		System.out.println("Method B");
	}
	
	void mem(int a, float b) {
		System.out.println("Method C");
	}
	public static void main(String args[]) {
		Test3 obj= new Test3();
		obj.mem(200, 12.20f);
		obj.mem(13.3f, 20);
		obj.mem(30, 22.12, 33.13);
	}
}
