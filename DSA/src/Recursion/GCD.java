package Recursion;

import java.util.Scanner;

public class GCD {
	static void gcd_brute_force(int x,int y) {
		int grtst=0;
		int smallest=0;
		if(x>y) {
			smallest=y;
		}
		else {
			smallest=x;
		}
		for(int i=smallest;i>1;i--) {
			if(x%i==0&&y%i==0) {
				if(grtst<i) {
					grtst=i;	
				}
			}	
		}
		System.out.println(grtst);
}
	
	static void long_div(int x,int y) {
		if(x>y) {
		while(x%y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
			
		}
		System.out.println(y);
		}
		else if(y>x) {
			while(y%x!=0) {
				int temp=x;
				x=y%x;
				y=temp;
				
			}
			System.out.println(x);
			
		}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//4
		int y=sc.nextInt();//8
		//gcd_brute_force(x, y);
		long_div(x, y);
		
		
		
  }
}
