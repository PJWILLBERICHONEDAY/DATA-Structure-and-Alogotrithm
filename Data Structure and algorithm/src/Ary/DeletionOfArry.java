package Ary;

import java.util.Scanner;

public class DeletionOfArry {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of Array");
		
		int sze=sc.nextInt();
		int[] arr=new int[sze];
		System.out.println("Enter the elements of array");
		for(int i=0;i<sze;i++) {
			arr[i]=sc.nextInt();//1 2 3 4
		}
		System.out.println("Enter the value");//3
		int value=sc.nextInt();
		for(int i=0;i<sze;i++) {//2<4
			if(arr[i]==value) {//arr[2]==3
				for(int j=i;j<sze-1;j++) {
				   arr[j]=arr[j+1];//arr[2]==arr[3]=	
				
				}
				break;
		}
			
	}
		for(int i=0;i<sze;i++) {
			System.out.println(arr[i]);
		}

}
}
