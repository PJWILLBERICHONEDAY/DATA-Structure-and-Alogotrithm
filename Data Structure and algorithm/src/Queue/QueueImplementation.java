package Queue;

public class QueueImplementation {
	int [] queue;
	int sze;
	int rear;
	int front;
	public QueueImplementation(int s) {
		sze=s;
		queue=new int[s];
		rear=0;
		front=0;
	}
	
	public void enque(int data) {
		if(rear==sze) {
			System.out.println("Full");
		}
		else {
			queue[rear]=data;
			rear++;
			System.out.println("Inserted");
		}
	}
	
	public void deque() {
		if(front==rear) {
			System.out.println("Empty");
		}
		else {
			for(int i=0;i<rear-1;i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	public void display() {
		for(int i=0;i<=rear;i++) {
			System.out.println(queue[i]);
		}
		
		
	}
	public static void main(String[] args) {
		QueueImplementation Qi=new QueueImplementation(5);
		Qi.enque(4);
		Qi.enque(3);
		Qi.enque(2);
		Qi.enque(1);
		Qi.display();
		Qi.deque();
		
	}
	

}
