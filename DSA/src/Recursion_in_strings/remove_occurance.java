package Recursion_in_strings;

import java.util.Scanner;

public class remove_occurance {
	
	static String remove_a(String s) {
		if(s.length()==0) {
			return " ";
		}
		String small_ans=remove_a(s.substring(1));
		
		char curr=s.charAt(0);
		//Self WOrk
		if(curr!='a') {
		return curr+small_ans;
		}
		else {
			return small_ans;
		}
		
		
	}
	static String remove(String s,int idx) {
		//base Case
		String ans=" " ;
		if(idx==s.length()) {
			return " ";
		}
		//Recursive work
				String smallans= remove(s, idx+1);
				
				char curr=s.charAt(idx);
		//Self WOrk
		if(curr!='a') {
		return ans=curr+smallans;
		}
		else {
			return smallans;
		}
	
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(remove(s, 0));
		System.out.println(remove_a(s));
	}

}
