package Recursion;

import java.util.Scanner;

public class power {
	static int power(int p,int q) {
		if(q==0) {
			return 1;
	}
		if(q%2==0)
		return power(p, q/2)*power(p, q/2);
		
		else { 
			return power(p, q/2)*power(p, q/2)*p;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println(power(p, q));
	}

}
