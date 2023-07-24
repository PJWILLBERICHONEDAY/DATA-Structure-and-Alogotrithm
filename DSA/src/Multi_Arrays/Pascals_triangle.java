package Multi_Arrays;

import java.util.Scanner;

public class Pascals_triangle {
	static void print_array(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number of rows in r1");
	int r=sc.nextInt();
	int [][] arr=new int[r][];   
	
	for(int i=0;i<r;i++) {
		
		//1st rule
//		ith row has i+1 columns
//		arr[0]=new int [1]
//		arr[1]=new int [2]
		arr[i]=new int [i+1]; 
		//2nd rule
		//1st and last is 1
		arr[i][0]=arr[i][i]=1;
		//3rd rule 
		for(int j=1;j<i;j++) {
			arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
		}
		
		
	}
	print_array(arr);
	
	
}
}
