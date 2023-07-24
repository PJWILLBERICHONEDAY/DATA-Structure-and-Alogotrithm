package Ary;

import java.util.Scanner;

public class ImplementingAry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sze=sc.nextInt();
		int[] arr=new int[sze];
		
		for(int i=0;i<sze;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<sze;i++) {
		if(arr[i]==3) {
			System.out.println(arr[i]+ "Number Found" + "at index" + i );
		}
		}
	}

}
