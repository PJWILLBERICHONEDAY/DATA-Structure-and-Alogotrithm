package Ary;

import java.util.Scanner;

public class InsertionInAry {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of arry");
		int sze=sc.nextInt();
		
		int ary[]=new int[sze+1];
		
		System.out.println("Enter the elements of array");
		for(int i=0; i<sze;i++) {
			ary[i]=sc.nextInt();
			System.out.println(ary[i]);
		}
		System.out.println("Enter the index you want to insert the given value");
		int index=sc.nextInt();
		System.out.println("Enter the Given Value at Index "+index );
		int val=sc.nextInt();
		for(int i=sze-1;i>=index;i--) {
			ary[i+1]=ary[i];
			
		}
		ary[index]=val;
	
		for(int i=0; i<sze+1;i++) {
			System.out.println(ary[i]);
		}
	}

}
