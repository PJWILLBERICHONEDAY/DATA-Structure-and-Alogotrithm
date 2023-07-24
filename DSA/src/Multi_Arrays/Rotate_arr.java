package Multi_Arrays;

import java.util.Scanner;

public class Rotate_arr {
	static void print_array(int [][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
	static void swap_matrix(int matrix[][], int r, int c) {
		for(int i=0;i<c;i++) {
			for(int j=i;j<r;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	
	
	static void reverse_arr(int[] arr) {
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	static void rotate(int matrix[][], int n) {
		//transpose an array
		//reverse an array
		
		swap_matrix(matrix, n, n);
		
		for(int i=0;i<n;i++){
			reverse_arr(matrix[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of Columns");
		int c=sc.nextInt();
		int [][] arr=new int[r][c];   
		int [][] t_arr=new int[c][r];
		System.out.println("Enter number "+ r*c +" of elements");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//Using two matrix Transpose
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				t_arr[j][i]=arr[i][j];
//			}
//		}
		//using single matrix transpose
		System.out.println("Before transpose");
		print_array(arr);
		System.out.println(" after transpose");

		System.out.println("After rotation");
		rotate(arr, r);
		print_array(arr);
		
		
//			System.out.println("BEFOR");
//		print_array(arr);
//		System.out.println("AFTER TRANSPOSE");
//		print_array(t_arr);
		
	}

}


