package ArrayList;


import java.util.ArrayList;

public class AryList {
	public static void main(String[] args) {
	//wrapper classes
		Integer i=Integer.valueOf(4);
		System.out.println(i);
	
	// Syntex
	ArrayList<Integer>l1=new ArrayList<>();
	
	// Add element to list
	l1.add(1);
	l1.add(3);
	l1.add(5);
	l1.add(8);
	l1.add(2);
	
	// printing at perticular index
	
//	System.out.println(l1.get(1)); // 
	
	// Print with for loop
	
//	for (int i=0;i<l1.size();i++) {
//		System.out.println(l1.get(i));
//	}
	
	//printing the array list directly
	System.out.println(l1);
	
	//adding element at some index i
	l1.add(1,100);
	System.out.println(l1);
	
	//modifying element at index i
	l1.set(1, 10);
	System.out.println(l1);
	
	//removing an elemenr at index i
	l1.remove(2);
	System.out.println(l1);
	
	//removing an element e
	System.out.println(l1.remove(Integer.valueOf(5)));//true
	System.out.println(l1);
	
	//checking if an element exists
	boolean ans=l1.contains(Integer.valueOf(8));
	System.out.println();
	
	
	//if you dont specify wrapper class, you can put anything inside it
	ArrayList l=new ArrayList();
	l.add("anything");
	l.add(1);
	l.add(true);
	System.out.println("if you dont specify wrapper class, you can put anything inside it");
	System.out.println(l);
	
	}

}
