package Recursion;

import java.util.Scanner;

public class Count__digit {
	static int count(int n) {
		if(n>=0&&n<=0) {
			return n;
		}
		return count(n/10)+1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
	}

}
