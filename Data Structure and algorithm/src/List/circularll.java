package List;

import java.util.Scanner;

import List.InsertStart.Node;

public class circularll {
	 Node head;
	 Node tail;
	 class Node{
		 int data;
		 Node next;
		 
		 public Node(int data) {
			 this.data=data;
			 this.next=next;
		 }
	 }
		 //abhi node ka head 423 pe hai 
	 
	 public void Insertatfirst(int data) {
		  Node newNode = new Node(data);
		 
		  if (head == null) {
		    
		    head = newNode;
		    tail = newNode;
		    newNode.next = head;
		  } else {
		    Node temp = head;  
		    newNode.next = temp;
		    head = newNode; 
		    tail.next = head;
		    
		  }
	}
		 
		 
		
	 public void insertAtLast(int data) {
		
		  Node newNode = new Node(data);

		  if (head == null) {
		   
		    head = newNode;
		    tail = newNode;
		    newNode.next = head;
		  }
		  else {
		 
		    tail.next = newNode;
		    tail = newNode;
		    tail.next = head;
		  }
		}
		 
		 
		 //Deletion from front
		 public void deletionfromfirst(int val) {
			 Node pptr=head;
			 while(pptr.data!=val) {
				 pptr=pptr.next;	 
			 }	 
		 }
		 
		 
		 //Display
		 public void display() {
			  Node temp = head;
			  if (head != null) {
			    do {
			      System.out.printf("%d ", temp.data);
			      temp = temp.next;
			    } while (temp != head);
			  }
			  System.out.printf("\n");
			}
		 
		 public static void main(String[] args) {
			InsertStart Is=new InsertStart();	
			Scanner sc=new Scanner(System.in);
			//int z=sc.nextInt();
			
			Is.Insertatfirst(4);
			Is.Insertatlast(7);
			Is.Insertatlast(5);
			
			Is.display();
			
		}

}
