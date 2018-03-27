package basic.queue;

import java.util.Deque;

public class QueueByArray {
	int front;
	int rear;
	int size;
	int capacity;
	int array[];
	public QueueByArray(int capacity){
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = this.capacity -1 ;
		this.array = new int[this.capacity];
	}
	
	public boolean isFull(QueueByArray queue){
		return queue.capacity == queue.size;
	}
	
	public boolean isEmpty(QueueByArray queue){
		return queue.size == 0;
	}
	
	public void enQueue(int item){
		if(isFull(this)){
			System.out.println("Overflow!");
			return;
		}
		this.rear = (this.rear +1 ) % this.capacity;
		this.array[this.rear] = item;
		this.size+=1;
		System.out.println("enqueued item ::"+item);
	}
	
	public int deQueue(){
		if(isEmpty(this)){
			System.out.println("Underflow!");
			return Integer.MIN_VALUE;
		}
		
		int item = array[this.front];
		this.front = (this.front +1) % this.capacity;
		this.size -=1;
		return item;
	}
	
	public int getFront(){
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.array[this.front];
	}
	
	public int getRear(){
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	
	
	public static void main(String[] args) {
		QueueByArray queue = new QueueByArray(5);
		queue.enQueue(10);
		queue.enQueue(11);
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		
		System.out.println("Front="+queue.getFront());
		System.out.println("Rear="+queue.getRear());
		
		System.out.println("Dequeued ::"+queue.deQueue());
		System.out.println("Dequeued ::"+queue.deQueue());
		
		System.out.println("Front="+queue.getFront());
		System.out.println("Rear="+queue.getRear());
		
		queue.enQueue(15);
		queue.enQueue(16);
		queue.enQueue(17);
	}
}
