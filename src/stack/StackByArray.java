package stack;

public class StackByArray {
	static final int MAX = 100;
	int top;
	int array[] = new int[MAX];
	
	public StackByArray(){
		top = -1;
	}
	
	boolean isEmpty(){
		return top < 0;
	}
	
	boolean push(int item){
		if(top >= MAX){
			System.out.println("Overflow");
			return false;
		}
		array[++top] = item;
		return true;
	}
	
	int pop(){
		if(top < 0){
			System.out.println("Underflow");
			return -1;
		}
		
		return array[top--];
	}
	
	public static void main(String[] args) {
		StackByArray s = new StackByArray();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println(s.pop() + " Popped from stack");
	}
}
