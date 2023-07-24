package linkedlistf;

import java.util.LinkedList;
import java.util.Scanner;

public class implementationofll {
	Node head;
	Node tail;
	int size;
	
	public implementationofll() {
	
		head=tail=null;
		size=0;
	}
	
	class Node{
		int data;
		Node next;
		public Node(int d) {
			this.data=d;
			this.next=null;
		}
	}
	
	public void addlast(int d) {//add method 
		Node n=new Node(d);//makes new node n
		if(head==null) {
			head=tail=n;//head and tail should points towards 1st node
		}
		else {
			tail.next=n;//1stnode.next=new node
			tail=n;//tail should rmain at last
		}
		size++;
		 }
	
	
	public void addFirst(int d) {
		Node newNode=new Node(d);
		if(head==null) {
			newNode=head;
			
		}
		else {
		newNode.next=head;
		head=newNode;
		}
	}
	
	void display(Node head) {
		while(head!=null) {
			System.out.println((head.data));
			head=head.next;
			
		}
	}
	
	
	void removefirst() {
		head=head.next;
		
	}
	
	void removelast() {
		Node second_last=head;
		while(second_last.next!=null) {
			second_last=second_last.next;
			
			
			
		}
		second_last.next=null;
	}
	
	
	public static void main(String[] args) {
		implementationofll l1=new implementationofll();
		l1.addlast(6);
		l1.addlast(9);
		l1.addlast(7);
		l1.addlast(10);
		l1.addlast(8);
		l1.addFirst(2);
		l1.addFirst(33);
		
		
		 l1.removelast();
		 l1.display(l1.head);
		 
  }
	

}
