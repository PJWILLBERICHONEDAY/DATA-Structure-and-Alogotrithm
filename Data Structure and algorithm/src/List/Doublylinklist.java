package List;

import List.Linklist.Node;

public class Doublylinklist {
	Node head;
	class Node{
		
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
	}
	public void insertatfirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode=head;
			return;
		}
		else {
			 newNode.next = head;
			 newNode.prev = null;//head yani head ka address 
		}
		
	}
	public void insertatlast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode=head;
		}
		else {
			Node ptr=head;
			while(ptr.next!=null) {
				ptr=ptr.next;
				ptr.next=newNode;
				
			}
			ptr.next=newNode;
		}
	}
	public void deleteafterGiven(int val) {
		Node ptr=head;
		while(ptr.data!=val) {
			ptr=ptr.next;
		}
			ptr.next=ptr.next.next;
		
			ptr.next.next.prev=ptr.next;
			
		
		
		
	}
	 public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	    } 
public static void main(String[] args) {
	Doublylinklist db=new Doublylinklist();
	db.insertatfirst(5);
	db.insertatfirst(7);
	db.insertatfirst(9);
	db.insertatfirst(11);
	db.();
}

	
	
	

}
