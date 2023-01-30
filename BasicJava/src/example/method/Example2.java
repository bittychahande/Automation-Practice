package example.method;

public class Example2 {

	public static void main(String[] args) {
		//Area of circle
		//areaOfCircle(3.14f,22);
		System.out.println(areaOfCircle(3.14f,22));
		
		
	}
	static double areaOfCircle(float pi, int r) {
		System.out.println("value of pi:"+pi);
		System.out.println("value of radius:"+r);
		double res= (pi*r*r);
		return res;
	}

}
