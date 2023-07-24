package List;

import java.util.Scanner;

import List.Linklist.Node;

public class InsertStart {  
	 Node head;
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
			 Node newNode=new Node(data);
			 if(head==null) {
				 newNode=head;
				 return;
			 }
			 else {
				 newNode.next=head;//423
				 
				 head=newNode;//423=new node
			 }
		}
		 
		 
		 //Insertion at last
		 public void Insertatlast(int data) {
			 Node ptr=new Node( data);
			 if(head==null) {
				 head=ptr;
			 }
			 else {
				 //Traverse 
				 Node Nodenew=head;
				 while(Nodenew.next!=null) {
					 Nodenew=Nodenew.next;
				 }
				 Nodenew.next=ptr; 
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
				
				Node currNode=head;
				  if(head == null) {    
			            System.out.println("List is empty");    
			            return;    
			        } 
				  else {
				while(currNode!=null) {
					System.out.println(currNode.data+":-");
				
					currNode=currNode.next;
				}
				
				}
				
			}
		 public static void main(String[] args) {
			InsertStart Is=new InsertStart();	
			Scanner sc=new Scanner(System.in);
			//int z=sc.nextInt();
			Is.Insertatfirst(8);
			Is.Insertatfirst(4);
			Is.Insertatlast(7);
			
			Is.display();
			
		}
		 
		 
		
	 
}  