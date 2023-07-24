package Ary;

import java.util.Scanner;


public class hashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sze=sc.nextInt();
		int[] arr=new int[sze];
		
		for(int i=0;i<sze;i++) {
			int num=sc.nextInt();
			int range=num%sze;
			arr[range]=num;	
		}
		
		for(int i=0;i<sze;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
