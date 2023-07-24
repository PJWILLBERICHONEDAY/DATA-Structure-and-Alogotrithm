package Stacks;

import java.util.Scanner;

public class Impementaition {
	

		//last in first out
		
		int sze;
		int[] stck;
		int top=-1;
		
		public Impementaition(int s) {
			sze=s;
			stck=new int[sze];
			
			
		}
		
		public void push(int data) {
			if (top==sze-1) {
				System.out.println("Full");
			}
			else {
				top++;
				stck[top]=data;
			//	System.out.println(stck[top]);
				System.out.println("Inserted");
			}
	}
		
		public void pop() {
			if(top==-1) {
				System.out.println("Empty");	
			}
			else {
			
				System.out.println(stck[top--]);
				System.out.println("Deleted");
			}
		}
		
		
		public void display() {
			for(int i=sze-1;i>=0;i--) {// 
				System.out.println(stck[i]);
			}
		}
		public static void main(String[] args) {
			Impementaition ip=new Impementaition(7);
			ip.push(5);
			ip.push(4);
			ip.push(7);
			ip.push(6);
			ip.display();
		ip.pop();
		ip.pop();
		ip.display();
		}
}
