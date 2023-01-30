package day2.practice;

public class Demo1 {

	public static void main(String[] args) {
	
		int a=0,b;
		b= a++ + ++a + ++a + a;
		//res =   0 + 2 + 3 + 3
		//final = 1   2   3   3
		System.out.println(a);//3
		System.out.println(b);//9
		
		a=0;
		b= a-- + --a + --a + a;
		//res =    0 + -2 + -3
	    //final = -1   -2   -3
		System.out.println(a);//-3
		System.out.println(b);//-6
		
		a=0;
		b= --a + --a + --a + a + ++a + a++;
		//res=  -1 + -2 + -3 + -3 + -2 + -2
	    //fnl = -1   -2   -3   -3   -2   -1
		System.out.println(a);//-1
		System.out.println(b);//-12
		
		a= 0;
		b= a-- + a + ++a + a++ + ++a + a++ + a;
		//res=  0 + -1 + 0 + 1 + 2 + 2 + 3
		//fnl= -1   -1   0   1   2   3   3
		System.out.println(a);//3
		System.out.println(b);//7
		
	}

}
