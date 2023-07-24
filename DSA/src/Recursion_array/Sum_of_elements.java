package Recursion_array;

import java.util.Scanner;

public class Sum_of_elements {
	static int sum_arr(int [] arr,int idx ) {
		if(idx==arr.length) {
			return 0;
			
		}
		return  sum_arr(arr, idx+1)+arr[idx];
	}
	public static void main(String[] args) {
		int [] arr= {2,3,5,20,11};
		System.out.println(sum_arr(arr, 0));
	}

}
