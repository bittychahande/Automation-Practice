package string.examples;

public class Example1 {

	public static void main(String[] args) {
		String s1=new String ("India");
		String s2= new String("Mumbai");
		String s3= new String("India");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("compare s1 and s2 object on basis of adress:"+(s1==s2));
		System.out.println("compare s2 and s3 object on basis of adress:"+(s2==s3));
        System.out.println("compare s1 and s2 object on basis of adress:"+(s1==s2));
        System.out.println("compare s1 and s2 object on basis of value:"+s1.equals(s2));
        System.out.println("compare s2 and s3 object on basis of value:"+s2.equals(s3));
        System.out.println("compare s1 and s3 object on basis of value:"+s1.equals(s3));
	}

}
