package inheritance;

class India{
	int i;
	India(){
		System.out.println("I am country");
		i=23;
	}
	void Country() {
		System.out.println("India is a country");
	}
	void Bharat() {
		System.out.println("Bharat desh");
	}
}
class Delhi extends India{
	int i;
	Delhi(){
		System.out.println("I am capital of India");
		i=87;
	} 
	void Bharat() {
		System.out.println("Desh Bharat");
	}
	void Capital() {
		System.out.println("Dilwali Delhi");
		System.out.println("sub class var"+i);
		System.out.println("super class var"+super.i);
		Bharat();
		super.Bharat();	
	}	
}
public class Inheritance02 {

	public static void main(String[] args) {
		Delhi d=new Delhi();
		d.Country();
		d.Bharat();
		d.Capital();
		System.out.println("*******************************");
		India i=new India();
		i.Country();
		i.Bharat();

	}

}
