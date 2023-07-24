package Multi_Arrays;

import java.util.Scanner;

public class multiDImarray {
	
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
		//user Input 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of Columns");
		int c=sc.nextInt();
		int [][] arr=new int[r][c];   
		
		
		System.out.println("Enter "+r*c+" elements of array");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
//		int [][] arr2= {{1,2,3},{4,5,6},{8,1,1}};
		printArray(arr);
		
		
	}

}
