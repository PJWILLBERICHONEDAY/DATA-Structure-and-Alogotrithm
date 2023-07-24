package Ary;

import java.util.ArrayList;
import java.util.List;

public class AryList {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		names.add("kevin");
		names.add("rock");
		names.add("black");
		names.add("adam");
		System.out.println(names.get(0));
		
		names.remove(0);
		System.out.println(names.get(0));
		System.out.println("The size of an arry list is:- " + names.size());
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
	}

}
