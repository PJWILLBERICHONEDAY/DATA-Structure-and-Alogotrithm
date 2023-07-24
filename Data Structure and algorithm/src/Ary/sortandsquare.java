package Ary;

import java.util.Scanner;

public class sortandsquare {
	public static void main(String[] args) {
		//bubble sort
		Scanner sc=new Scanner (System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//ifarr[0]>arr[1]==Swap
		boolean  swap=true;
		while(swap) {
			swap=false;
  	     for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				swap=true;
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=arr[i];
			}
		}
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
