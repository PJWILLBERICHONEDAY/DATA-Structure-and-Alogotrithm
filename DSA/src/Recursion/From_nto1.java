package Recursion;

import java.util.Scanner;

public class From_nto1 {
	static void print_decreasing(int n) {
		// Base Work
		if(n==1) {
			System.out.println(1);
			return;
		}
		//Self Work
		System.out.println(n);
		
		//Recursive Work
		print_decreasing(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		print_decreasing(n);
		
	}

}
