package Recursion;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		//Base Work
		if(n==0) {
			return 1;
		}
		//SelfWork*Sub_Problem
		return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}

}
