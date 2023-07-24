package Recursion;

import java.util.Scanner;

public class Sum_of_integers {
	static int sum (int n) {
		//Base Case
		int count=0;
		if(n>=0&&n<=0) {
			return n;
		}
		//Recursive+SelfWork
		int ans=sum(n/10)+n%10;
		count++;
		
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		System.out.println(sum(d));
	}


}
