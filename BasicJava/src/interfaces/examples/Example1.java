package interfaces.examples;

interface A1{
    void a();
	void b();
	void c();
	void d();
}
abstract class Bitty implements A1{
	public abstract void a();
	public abstract void b();
	public abstract void d();
	public void c() {
		System.out.println("I am c");
	}
	public void e() {
		System.out.println("I am e");
	}
}
class Kitty extends Bitty{
	public void a() {
		System.out.println("I am a");
	}
	public void b() {
		System.out.println("I am b");
	}
	public void d() {
		System.out.println("I am d");
	}	
}
public class Example1 {

	public static void main(String[] args) {
		Kitty k=new Kitty();
		k.a();
		k.b();
		k.c();
		k.d();
		k.e();
		

	}

}
