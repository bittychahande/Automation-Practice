package asssignment.ifelse;

public class Example12 {

	public static void main(String[] args) {
		// prime number
		int num =28;
		for(int i=2; i<=num/2; ++i) {
			if(num%i==0) {
			System.out.println("Number is prime:"+num);
			}else {
				System.out.println("Number is non-prime:"+num);	
			}
		}

	}

}
