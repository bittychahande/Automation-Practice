package inheritance;

public class Test1 {
	Test1()
	{
		super();
		System.out.println("running Test1() constructor");
	}
}
class Test2 extends Test1
{
	Test2(int a)
	{
		System.out.println("running Test2() constructor");	
	}
}
class Test3 extends Test2
{
	Test3()
	{ 
		super(13);
		System.out.println("running Test3() constructor");
	}
}
class Run2
{
	public static void main(String[] args) {
		System.out.println("program starts");
		Test3 t1=new Test3();
		System.out.println("program ends");
		

	}

}
