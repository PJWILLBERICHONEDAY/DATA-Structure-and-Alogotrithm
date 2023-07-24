package List;

import List.InsertStart.Node;

public class Linklist {
	Node head;
	class Node{
		
		 int data;
		 Node next;
		
		 public Node(int data) {
			this.data = data;
			this.next=null;
		}
	}
	
		public void addFirst(int data) {
			Node newNode=new Node(data); 
			if(head==null) {
				head=newNode;
				return;
			}
			 else {         
				    newNode.next=head;
				    head=newNode;
//		            Node temp = head;  
//		            head = newNode;   
//		            head.next = temp;  
		        }  	
		}
		
		
	
    public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode=head;
		}	
		else {
			Node currNode=head;
			while(currNode.next!=null) {
				currNode=currNode.next;
			}
			currNode.next=newNode;
		}
	}
		
    
	
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
		Linklist ll=new Linklist();
		ll.addFirst(5);
		ll.addFirst(8);
		ll.addFirst(9);
		ll.addFirst(0);
		ll.addFirst(3);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		
		ll.display();
		
		
		
		
		}

}

