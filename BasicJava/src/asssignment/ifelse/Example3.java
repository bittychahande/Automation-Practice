package asssignment.ifelse;

public class Example3 {

	public static void main(String[] args) {
		double n1=250, n2=360, n3= 33.44;
		if (n1>=n2 && n1>=n3) {
			System.out.println("Is the largest number:" +n1);
		}else if(n2>=n1 && n2>=n3) {
			System.out.println("Is the largest number:" +n2);
		}else {
			System.out.println("Is the largest number:" +n3);
		}

	}

}
