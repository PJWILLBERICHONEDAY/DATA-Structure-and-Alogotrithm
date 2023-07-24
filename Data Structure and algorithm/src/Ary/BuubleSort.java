package Ary;

import java.util.Scanner;

public class BuubleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sze=sc.nextInt();
		int[] bs=new int[sze];
		for(int i=0;i<sze;i++) {//8 9 6 7 2
			bs[i]=sc.nextInt();
			 bs[i]=(bs[i]*bs[i]);
			 
		}
		
		//We Compare array of index 0 to array of index 1 
		boolean swap=true;
		while(swap) {
			swap=false;
		for(int i=0;i<sze-1;i++) {//0 4
			if(bs[i]>bs[i+1]) {//8>9
				swap=true;
				int temp=bs[i];
				bs[i]=bs[i+1];
				bs[i+1]=temp;
			}
			
		}
		}
		for(int i=0;i<sze;i++) {
			System.out.println(bs[i]);
			
		}
	}
}
