package Recursion;

import java.util.Scanner;

public class k_multiple {
	static void multiple(int num ,int k) {
		if(k==0) {
		
			return;
		}
		multiple(num, k-1);
		System.out.println(num*k);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		multiple(n, k);
	}

}
