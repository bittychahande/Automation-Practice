package arrays.examples;

public class Example2 {
//average of numbers
	public static void main(String[] args) {
		int[] num= {2, -3, 10, -11, 30, -9, 11};
		double sum= 0;
		double average;
		
		for (int number: num) {
			sum= sum+number;
		}
		
int arrayLength= num.length;
average= sum/arrayLength;
System.out.println("Sum:"+sum);
System.out.println("Average:"+average);
	}

}
