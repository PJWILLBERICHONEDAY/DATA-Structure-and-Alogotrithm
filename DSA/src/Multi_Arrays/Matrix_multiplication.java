package Multi_Arrays;

import java.util.Scanner;

public class Matrix_multiplication {
	static void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {//row
		//  	System.out.println(arr[i]);
			for(int j=0;j<arr[i].length;j++) {//column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number of rows in r1");
		int r1=sc.nextInt();
		
		System.out.println("Enter Number of Columns in c1");
		int c1=sc.nextInt();
		System.out.println(" Number of rows in r2 ==c1");
		int r2=c1;
		
		System.out.println("Enter Number of Columns in c2");
		int c2=sc.nextInt();
		int [][] arr=new int[r1][c1];   
		int [][] arr2=new int[r2][c2];
		int [][] mul=new int[r1][c2];
		
		System.out.println("Enter "+r1*c1+" elements of array 1");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter "+r2*c2+" elements of array 2");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
//		int [][] arr2= {{1,2,3},{4,5,6},{8,1,1}};
		System.out.println(" Arr1 ");
		printArray(arr);
		System.out.println(" arr2 ");
		printArray(arr2);
		
		for(int i=0; i<r1;i++) {
			for(int j=0; j<c2;j++) {
				for(int k=0;k<r2;k++) {
				
					mul[i][j]+=(arr[i][k]*arr2[k][j]);
				}
			}
		}
		System.out.println("multiplication of array1 and array 2");
		printArray(mul);
		
	}
}
