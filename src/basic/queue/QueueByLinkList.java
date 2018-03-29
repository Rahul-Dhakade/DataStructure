package basic.queue;

public class QueueByLinkList {
	QNode front,rear;
	
	public void enQueue(int data){
		QNode temp = new QNode(data);
		if(this.rear == null){
			this.front = this.rear = temp;
			System.out.println("Enqueued item is "+data);
			return;
		}
		
		this.rear.next = temp;
		this.rear = temp;
		System.out.println("Enqueued item is "+data);
	}
	
	QNode deQueue(){
		if(this.front == null){
			return null;
		}
		
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null){
			this.rear = null;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		QueueByLinkList q =new QueueByLinkList();
	        q.enQueue(10);
	        q.enQueue(20);
	        
	        System.out.println("Dequeued item is "+ q.deQueue().data);
	        System.out.println("Dequeued item is "+ q.deQueue().data);
	        
	        q.enQueue(30);
	        q.enQueue(40);
	        q.enQueue(50);
	        q.enQueue(60);
	        q.enQueue(70);
	        q.enQueue(80);
	         
	        System.out.println("Dequeued item is "+ q.deQueue().data);
	        System.out.println("front "+q.front.data);
	        System.out.println("rear "+q.rear.data);
	}
}

class QNode{
	QNode next;
	int data;
	
	public QNode(int data){
		this.data = data;
		this.next = null;
	}
}
