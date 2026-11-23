package stack;

public class Stack {
	int[] stack;
	int top;

	public Stack(int size) {

		stack = new int[size];
		top = -1;

	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == stack.length - 1;

	}
	public void push(int v) {
		if(isFull()) {
			System.out.println("full");
		}else{
			stack[++top]=v;
			System.out.println(v);
		}
	}
	public void pop() {
		if(isEmpty()){
			System.out.println("Empty");
		}else {
			System.out.println("The value "+stack[top]+" Popped");
			top--;
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("The value is"+stack+" top");
		}
		
	}
	public void delete() {
		stack=null;
		System.out.println("Deleted");
	}
	

	public static void main(String[] args) {
		Stack s = new Stack(5);
		//s.isEmpty();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("*************************************");
		s.peek();
		s.pop();
		
		
		

	}

}
