package methodoverloading.example;

public class Test1 
{ 
	public void disp(char c) {
	 
	      System.out.println(c);
	}
	public void disp(char c, int num) {
	
		 System.out.println(c+ " "+num);	
	}
} 
class Test2
{
	public static void main(String[] args) {
	
	  Test1 obj=new Test1();
	  obj.disp('a');
	  obj.disp('a', 10);

	}

}
