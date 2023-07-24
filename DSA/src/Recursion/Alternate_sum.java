package Recursion;

import java.util.Scanner;

public class Alternate_sum {
	static int alternate(int n) {
		if(n==0) {
			return 0;
		}
		if(n%2==1) {
			return alternate(n-1)+n;
		}
		return alternate(n-1)-n;
		
			
		
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(alternate(n));
	}
	

}
