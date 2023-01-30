package string.examples;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		String s1="CoreJavaBasics";
		String s2="I am Pranjali";
		String s3="I     am    from     Chandrapur";
        /*System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(4));
        System.out.println(s1.charAt(5));
        System.out.println(s1.charAt(6));
        System.out.println(s1.charAt(7));
        System.out.println(s1.charAt(8));
        System.out.println(s1.charAt(9));
        System.out.println(s1.charAt(10));
        System.out.println(s1.charAt(11));
        System.out.println(s1.charAt(12));
        System.out.println(s1.charAt(13));
        System.out.println("*******************");
        System.out.println(s2.charAt(10));
        System.out.println(s2.charAt(5));
        System.out.println("*******************");
        System.out.println(s3.charAt(30));
        System.out.println(s3.charAt(3));*/
        System.out.println("Total char in String:"+s1.length());
        System.out.println("Total char in String:"+s2.length());
        System.out.println("Total char in the String:"+s3.length());
        
   /*for(int i=0;i<s1.length();i++) {
	   System.out.println("char at index"+i+":"+s1.charAt(i));
   }
   System.out.println("**************************************************");
   for(int i=0;i<s2.length();i++) {
	   System.out.println("char at index"+i+":"+s2.charAt(i));
   }
   System.out.println("*********************************************");
   for(int i=0;i<s3.length();i++) {
	   System.out.println("char at index"+i+":"+s3.charAt(i));
	  
   }*/
 System.out.println("**************************************************************");
String name;
Scanner sn=new Scanner(System.in);
System.out.println("Enter your name:");
name =sn.next();
System.out.println("My name is:"+name);

String[] names=new String[6];
for(int i=0;i<name.length();i++) {
	System.out.println("Enter emp name:");
	names[i]=sn.next();
}
for(String n:names) {
	System.out.println(n);
}

	}
    
        
	}


