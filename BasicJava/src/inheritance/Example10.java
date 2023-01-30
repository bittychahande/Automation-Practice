package inheritance;
 
class A1 {
	static int a=20;
	int b= 10;
	double c= 3.4;
}
class B1 extends  A1 {
	static int x=30;
	int y= 40;
	double z= 40.88;
}
class C1 extends B1{
	static int e=55;
	int g=46;
	float f= 99.2f;	
}
public class Example10 {

	public static void main(String[] args) {
		//static variables
		System.out.println("class A1 static variable:" +A1.a);
		System.out.println("class A1 static variable:" +B1.x);
		System.out.println("class A1 static variable:" +C1.e);
		
		//non static variables
		System.out.println("******************************");
		C1 a1=new C1();
		System.out.println("with class C reference:" +a1.b);
		System.out.println("with class C reference:" +a1.c);
		System.out.println("with class C reference:" +a1.y);
		System.out.println("with class C reference:" +a1.z);
		System.out.println("with class C reference:" +a1.g);
		System.out.println("with class C reference:" +a1.f);

	}

}
