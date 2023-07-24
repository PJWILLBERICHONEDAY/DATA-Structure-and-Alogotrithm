package Strings;

import java.util.Scanner;

public class String_Encoding {
	public static void run_length_encoding(String Input) {
		int n=Input.length();
		int count=0;
		for(int i=0;i<n;i++) {
			if(Input.charAt(i)==i) {
				count++;
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String Input=sc.nextLine();
		System.out.println(run_length_encoding(Input));
		
	}

}
