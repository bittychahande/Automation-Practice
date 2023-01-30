package inheritance;

public class Testing1 {
	 int j=20;
}
class Testing2 extends Testing1 {
	float f= 30.93f;
}
class Testing3 extends Testing2{
	double d=33.3;
}
class Run1
{
	
   public static void main(String[] args) {
	System.out.println("program starts"); 
	Testing2 a1= new Testing2();
	System.out.println("j="+a1.j);
	System.out.println("f="+a1.f);
	System.out.println("----------------------------");
	Testing3 b1= new Testing3();
	System.out.println("j="+b1.j);
	System.out.println("f="+b1.f);
	System.out.println("d="+b1.d);
	System.out.println("program ends"); 
	}

}
