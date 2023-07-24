package Recursion;

import java.util.Scanner;

public class sum_d_digits {
	static int sum (int d) {
		//Base Case
		
		if(d==0) {
			return 0;
		}
		//Recursive+SelfWork
		int ans=sum(d-1)+d;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		System.out.println(sum(d));
	}

}
