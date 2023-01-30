package collection.examples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		ArrayList set1=new ArrayList();
		//or
		List pq1=new ArrayList();
		System.out.println("List collection is empty?" +pq1.isEmpty());

		pq1.add("Bitty");
		pq1.add(25);
		pq1.add("Sakhi");
		pq1.add("null");
		System.out.println("List elements are:"+pq1);
		System.out.println("List collection is empty?"+pq1.isEmpty());
		
		pq1.add(0, "Kityy");
		System.out.println("List elements are:"+pq1);
		
		pq1.set(4,"Pranjali");
		System.out.println("Updated list is:"+pq1);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		List pq2=new ArrayList();
		pq2.add("Sanu");
		pq2.add("Rutu");
		pq2.add("Arru");
		System.out.println("List2 element is:"+pq2);
		 
		pq2.addAll(pq1);
		System.out.println("After adding List1 to List2:"+pq2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		List pq3=new ArrayList();
		pq3.add("Guddi");
		pq3.add("Sweety");
		pq3.add("Golu");
		System.out.println("List3 elements are:"+pq3);
		
		pq3.addAll(2,pq1);
		System.out.println("List3 elements are:"+pq3);
		
		System.out.println("Element present in 5th index"+":"+pq3.get(5));
		System.out.println("List3 element count:"+pq3.size());
		
		for(int i=0;i<pq3.size();i++) {
			System.out.println("Element at index:"+pq3.get(i));
			
		}
		for(Object obj:pq3) {
			System.out.println(obj);	
		}
		System.out.println("*****************************************************************************");
		
		List pq4=new ArrayList();
		pq4.add(23);
		pq4.add(34);
		pq4.add(12);
		System.out.println("List4 elements are:"+pq4); 
		//Iterator use
		 Iterator a1=pq4.iterator();
		 //System.out.println(a1.next());
		// System.out.println(a1.next());
		// System.out.println(a1.next());
		// System.out.println(a1.next());
		 
		 while(a1.hasNext()) {
			 System.out.println(a1.next());
			 
		 }
		 
		 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		 Iterator a2=pq3.iterator();
		 while(a2.hasNext()) {
			 System.out.println(a2.next());
		 }
	}

}
