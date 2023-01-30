package example.method;

public class Example1 {
   //static method
	public static void main(String[] args) {
		getValue(12, 23);
		getValue(9, 54);
		getValue(12, 3);
		averageOfNumber(10,20,30);
		System.out.println("average of number is:"+averageOfNumber(3,5,7));
		System.out.println("************************************************");
		int avg=averageOfNumber(40,5,60);
		System.out.println("Average :"+avg);
		int finalNumber=111+avg;
		System.out.println("New number is:"+finalNumber);
	}
	
    public static void getValue(int a, int b) {
    	int res= a*b;
    	System.out.println("num1 :"+a);
    	System.out.println("num2 :"+b);
    	System.out.println("Res :"+res);
    }
   
   static int averageOfNumber(int num1, int num2, int num3) {
	int res=(num1+num2+num3)/3;
	System.out.println("Number1 is :"+num1);
	System.out.println("Number2 is :"+num2);
	System.out.println("Number3 is :"+num3);
	return res;
}
	
}
