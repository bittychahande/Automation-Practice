package inheritance;

class Example1 {
	void callingFromJio() {
		System.out.println("Jio network");
	}
}
class Example2 {
	void calligFromVoda() {
		System.out.println("Voda network");
	}
}
class Example3 {
	void callingFromIdea() {
		System.out.println("Idea network");
	}
}

public class Example0 {
	void callingMe() {
		System.out.println("My network");
	}

public static void main(String[] args) {
       Example0 e0 =new Example0();
       e0.callingMe();
       Example3 e3= new Example3();
       e3.callingFromIdea();
       Example2 e2= new Example2();
       e2.calligFromVoda();
       Example1 e1= new Example1();
       e1.callingFromJio();
       
	}

}
