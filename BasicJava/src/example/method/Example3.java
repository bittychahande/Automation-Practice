package example.method;

public class Example3 {
//non static method
	public static void main(String[] args) {
		Example3 a1=new Example3();
		System.out.println("average of number is:"+a1.averageOfNumber(3,5,7));
		System.out.println("************************************************");
		int avg=a1.averageOfNumber(4,5,6);
		System.out.println("Average :"+avg);
		int finalNumber=111+avg;
		System.out.println("New number is:"+finalNumber);
	}
	 int averageOfNumber(int num1, int num2, int num3) {
		int res=(num1+num2+num3)/3;
		System.out.println("Number1 is :"+num1);
		System.out.println("Number2 is :"+num2);
		System.out.println("Number3 is :"+num3);
		return res;
	 }
}
