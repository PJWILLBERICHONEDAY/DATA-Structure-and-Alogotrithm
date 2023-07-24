package Multi_Arrays;

import java.util.Scanner;

public class sum_of_matrices {
	static void printarr(int [][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
		
		System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of Columns");
		int c=sc.nextInt();
		int [][] arr=new int[r][c];   
		int [][] arr2=new int[r][c];
		int [][] sum=new int[r][c];
		
		System.out.println("Enter "+r*c+" elements of array 1");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter "+r*c+" elements of array 2");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
//		int [][] arr2= {{1,2,3},{4,5,6},{8,1,1}};
		printarr(arr);
		printarr(arr2);
		
		for(int i=0; i<r;i++) {
			for(int j=0; j<c;j++) {
				
					sum[i][j]=arr[i][j]+arr2[i][j];
				
			}
		}
		System.out.println("sum of array1 and array 2");
		printarr(sum);
		
	}

}
