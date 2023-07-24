package Queue;
import java.awt.Window.Type;
import java.util.Scanner;
public class queueclass {
	int rear =0;
	int front=0;
	int[] queue;
	int size;
	
	public queueclass(int s) {
		size=s;
		queue=new int[s];
	}
	
	public void enque(int data) {
		if(rear==size) {
			System.out.println("Queue is full");
		}
		else {
			queue[rear]=data;
			rear++;
			System.out.println("Inserted");
		}
	}
	public void deque() {
		if(front==rear) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=0;i<rear-1;i++) {//0<4
				queue[i]=queue[i+1];
				
			}
			rear--;
		}	
	}
	public void display() {
		for(int i=0;i<rear;i++) {//0<4
			System.out.println(queue[i]);
		}
			
	}
	public void frnt() {
		System.out.println(queue[front]);
		
	}
	
	public void reverse() {
		for(int i=0;i<size;i++) {
			q
		}
		
		
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int sze=sc.nextInt();
		
		queueclass qc=new queueclass(sze);
		qc.enque(2);
		qc.enque(4);
		qc.enque(9);
		qc.enque(7);
	//	qc.display();
		qc.frnt();
		for(int i=0;i<sze;i++) {//
		
		}
		for(int i=0;i<sze;i++) {
			qc.enque(i);
		}
		qc.display();
	
	}
}


