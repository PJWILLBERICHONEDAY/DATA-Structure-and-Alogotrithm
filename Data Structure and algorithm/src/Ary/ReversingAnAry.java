package Ary;

import java.util.Scanner;

public class ReversingAnAry {
	public static void main(String[] args) {
//		The problem is that we want to reverse a T[] array in O(N) linear time complexity and we want the 
//		algorithm to be in-place as well -so the algorithm can not use additional memory!
//		For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
//		Good luck!
		Scanner sc=new Scanner(System.in);
		int sze=sc.nextInt();
		
		int[] T=new int[sze];
		for(int i=0;i<sze;i++) {
			T[i]=sc.nextInt();
		}
//		for(int i=sze-1;i>=0;i--) {
//			
//			
//			System.out.println(T[i]);
//			
//		}
		
		for(int index =0;index<sze;index++) {//0
			for(int i=index+1;i<sze;i++)//i=1<5
		            T[index]=T[sze-i];	//0=5-1=4
		}
		for(int i=0;i<sze;i++) {
			System.out.println(T[i]);
		}
	
		
	}

}
