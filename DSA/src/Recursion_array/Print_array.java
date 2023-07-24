package Recursion_array;

import java.util.Scanner;

public class Print_array {
	static void print_arr_recursively(int[] arr,int index) {
		//Base Case
		if(index==arr.length ) {
			return ;
		}
		//SelfWork
		System.out.println(arr[index]);
		//recursive work-subproblem
		 print_arr_recursively(arr, index+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lenth=sc.nextInt();
		int[] arr=new int[lenth];
		for(int i=0;i<lenth;i++) {
			arr[i]=sc.nextInt();
		}
		print_arr_recursively(arr, 0);
		
	}

}
