package methodoverloading.example;

 class Example3 {
	 static int add(int a, int b) {
		 return a+b;
	 }
	 
	 static int add(int a, int b, int c) {
		 return a+b+c;
	 }
 }
 public class Example2 {
   public static void main(String[] args) {
    	   System.out.println(Example3.add(12,12));
    	   System.out.println(Example3.add(12,12,12));
	}

}
