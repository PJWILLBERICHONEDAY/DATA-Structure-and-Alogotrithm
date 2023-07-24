package Multi_Arrays;

import java.util.Scanner;

public class Prefix_method {
	static void print_array(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static void find_prefix_sum(int [][] arr){
		int r=arr.length;//length of row
		
		int l=arr[0].length;//calculate length of column 
		for(int i=0;i<r;i++) {
			for(int j=1;j<l;j++) {
				arr[i][j]+=arr[i][j-1];
			}
		}
	}
	static int findsum(int[][] matrix,int l1, int r, int r2, int l2) {
		int sum=0;
		find_prefix_sum(matrix);
		for(int i=l1;i<=l2;i++) {
			if(r>0) {
			sum+=matrix[i][r2]-matrix[i][r-1];
			}
			else {
				sum+=matrix[i][r2];
			}
		}
		
		return sum;
		//return sum;
	}
	
	
	static void findsum_brute(int[][] matrix,int l1, int r, int r2, int l2) {//high time complexity
		int sum=0;
		for(int i=l1;i<=l2;i++) {
			for(int j=r;j<=r2;j++) {
				sum+=matrix[i][j];
			}
		}
		System.out.println(sum);
	}
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number of rows in r");
	int r=sc.nextInt();
	System.out.println("Enter Number of Columns in c");
	int c=sc.nextInt();
	int [][] arr=new int[r][c];   
	System.out.println("Enter "+r*c+" elements of array 1");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("The array is ");
	print_array(arr);
	
	System.out.println("Enter the coordinates r1,l1,r2,l2");
	int r1=sc.nextInt();
	int l1=sc.nextInt();
	int r2=sc.nextInt();
	int l2=sc.nextInt();
	
	System.out.println("The sum of the given coordinates ");
	findsum_brute(arr, l1, r1, r2, l2);
	
	System.out.println("THe sum of rectange is "+  findsum(arr, l1, r1, r2, l2));
}
}
