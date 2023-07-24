package Multi_Arrays;

import java.util.Scanner;

public class Spiral_matrix {
	static void print_arr(int [][] arr ) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void spiral(int[][] arr,int r,int c) {
		int top_row=0;
		int btm_row=r-1;
		int rgt_clm=c-1;
		int lft_clm=0;
		
		int total_elements=0;
		while(total_elements<r*c) {
			//top row->traverse from left_clm to rgt_clm
			for(int j=lft_clm;j<=rgt_clm&&total_elements<r*c;j++) {
				System.out.print(arr[top_row][j]+" ");
				total_elements++;
			}
			top_row++;// so that number do not repeat
				
			//right_clm->top_row to btm_row
			for(int i=top_row;i<=btm_row&&total_elements<r*c;i++) {
				System.out.print(arr[i][rgt_clm]+" ");
				total_elements++;
			}
			rgt_clm--;
			
			//btm_row->rgt_clm to lft_clm
			for(int j=rgt_clm;j>=lft_clm && total_elements<r*c;j--) {
				System.out.print(arr[btm_row][j]+" ");
				total_elements++;
			}
			btm_row--;
			//left_clm->btm_row to top_row 
			for(int i=btm_row;i>=top_row&&total_elements<r*c;i--) {
				System.out.print(arr[i][lft_clm]+" ");
				total_elements++;
			}
			lft_clm++;
		}
		
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number of rows in r1");
	int r1=sc.nextInt();
	
	System.out.println("Enter Number of Columns in c1");
	int c1=sc.nextInt();
	
	int [][] arr=new int[r1][c1];   
	
	
	System.out.println("Enter "+r1*c1+" elements of array 1");
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Out Sprial print order");
	spiral(arr, r1, c1);
	
	System.out.println();
	
	System.out.println("The OG matrix");
	print_arr(arr);
   
}
}
