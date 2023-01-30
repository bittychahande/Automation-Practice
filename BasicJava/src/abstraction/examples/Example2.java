package abstraction.examples;

abstract class Fruit{
	Fruit(){
		System.out.println("Fruits are healthy");
	}
	abstract void Sweet();
	void Bitter(int i) {
		System.out.println("Bitter is taste: " +i);
	}
}
class Apple extends Fruit{
	Apple(){
		System.out.println(" I am apple");
	}
	void Sweet() {
		System.out.println("All fruits are sweet");
	}
  void Bitter(int i) {
	  System.out.println("Apple is sweet: " +i);
	  super.Bitter(22);
  }
	
}
public class Example2 {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.Sweet();
		a.Bitter(1);
		Fruit f=new Apple();
		f.Sweet();
		f.Bitter(9);

	}

}
