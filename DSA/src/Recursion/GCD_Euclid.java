package Recursion;

import java.util.Scanner;

public class GCD_Euclid {
	static int gcd_euclid_algo(int x,int y) {
		if(y==0) {
			return x;
		}
		return gcd_euclid_algo(y, x%y) ;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(gcd_euclid_algo(x, y));
	}

}
