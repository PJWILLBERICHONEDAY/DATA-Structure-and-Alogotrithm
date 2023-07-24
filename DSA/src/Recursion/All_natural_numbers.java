package Recursion;

import java.util.Scanner;

public class All_natural_numbers {
	
	static void print_natural(int n) {
		if(n==1) {
			System.out.println(1);
		}
		else {
			System.out.println(n);
			print_natural(n-1);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		print_natural(n);
	}

}
