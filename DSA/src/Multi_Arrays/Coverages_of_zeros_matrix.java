package Multi_Arrays;

import java.util.Scanner;

public class Coverages_of_zeros_matrix {
	    static void setZeroes(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;

	        // Use two arrays to keep track of the rows and columns that need to be set to 0
	        boolean[] rows = new boolean[m];
	        boolean[] cols = new boolean[n];

	        // Traverse the matrix and mark the rows and columns that contain 0
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (matrix[i][j] == 0) {
	                    rows[i] = true;
	                    cols[j] = true;
	                }
	            }
	        }
	        	int sum=0;
	        //Find the the sum of row  of converges of 0
	        for (int i = 0; i < m; i++) {
	            if (rows[i]) {
	                for (int j = 0; j < n; j++) {
	                    if(matrix[i][j] ==1) {;
	                    sum++;
	                    }
	                }
	            }
	        }
	        	
	        //Find the the sum of colum of converges of 0 
	        for (int j = 0; j < n; j++) {
	            if (cols[j]) {
	                for (int i = 0; i < m; i++) {
	                    if(matrix[i][j] == 1) {
	                    	sum++;
	                    	
	                    	
	                    }
	                }
	            }
	        }
	        System.out.println("the total sum is"+ sum);
	    }
	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int r=sc.nextInt();
			int c=sc.nextInt();
			
			int [][] arr=new int [r][c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			setZeroes(arr);
		}
	}



