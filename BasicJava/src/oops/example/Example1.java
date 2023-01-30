package oops.example;
class Maharashtra{
	Maharashtra(int num){
		System.out.println("I am constructure of Maharashtra:"+num);
	} 
	void printing() {
		
		System.out.println("I am printing of Maharashtra");
	}
    void calling() {
	  System.out.println("I am calling of Maharashtra");
	  }	
}
class Mumbai extends Maharashtra {
	Mumbai(){
	super(233);
	System.out.println("Mumbai is in Maharashtra");
	}
	void display() {
		System.out.println("I am display of mumbai");
	}
	void calling() {
		  System.out.println("I am calling of Maharashtra");
		  
		  super.calling(); 
		  }       
}
public class Example1 {

	public static void main(String[] args) {  
		Mumbai m1=new Mumbai();
		m1.display();
		m1.calling();
		System.out.println("*****************************");
		Maharashtra a1=new Maharashtra(233);
		a1.calling();
		a1.printing();
		System.out.println("*****************************");
		Maharashtra p1=new Mumbai();
		p1.calling();
		p1.printing();
	}

}
