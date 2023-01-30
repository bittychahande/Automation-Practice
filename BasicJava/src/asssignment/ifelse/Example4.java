package asssignment.ifelse;

public class Example4 {

	public static void main(String[] args) {
		int year= 1997;
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Common year or non leap year");
		}

	}
	
   }
