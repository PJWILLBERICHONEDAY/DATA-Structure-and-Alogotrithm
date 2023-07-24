package Recursion;

import java.util.Scanner;

public class Fibnocci {
	
	static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		int prev=fib(n-1);
		int Prev_2nd=fib(n-2);
		return n= prev+Prev_2nd;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
		
		
	}

}
