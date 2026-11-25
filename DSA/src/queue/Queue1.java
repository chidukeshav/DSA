package queue;

public class Queue1 {
	int[] queue;
	int toq, boq;

	public Queue1(int size) {
		queue = new int[size];
		toq = boq = -1;
	}
	public boolean isFull() {
		return toq==queue.length-1 ;
		
	}
	public boolean isEmpty() {
		return toq==-1||boq==queue.length;
	}
	void enqueue(int v) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else if(boq==-1){
			boq++;
		queue[++toq]=v;
		System.out.println(" The value "+v+"is inserted");
		}
		else {
			queue[++toq]=v;
			System.out.println("The value"+v+"got inserted");
		}
	}
	void dequeue() {
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
		}else {
			int v =queue[boq];
			boq++;
			System.out.println("The value "+v+"is inserted");
		}
		if(boq>toq) {
			boq=toq=-1;
		}
	}
	void peek() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
		}
		else {
			System.out.println("The value is"+queue[boq]);
		}
	}
	void delete() {
		queue=null;
		System.out.println("The queue is deleted");
	}
	public static void main(String[] args) {
		Queue1 q=new Queue1(5);
		System.out.println(q.isFull());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("**************");
		q.dequeue();
		System.out.println("**************");
		q.peek();
		
	}
}
