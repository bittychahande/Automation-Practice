package asssignment.ifelse;

public class Example13 {

	public static void main(String args[]) {
		int num1 = 25, num2 = 12, res;
		char op = '-';
		switch (op) {
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		
	}

}
