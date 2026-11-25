package stack;

import java.util.Stack;

public class WebHistory {
	private Stack<String> backward_stack;
	private Stack<String> forward_stack;
	private String current_page;

	public WebHistory() {
		backward_stack = new Stack<>();
		forward_stack = new Stack<>();
		current_page = "Home Page";
		System.out.println("u r in" + current_page);

	}

	public void visitpage(String page) {
		backward_stack.push(current_page);
		current_page = page;
		forward_stack.clear();
		System.out.println("the page is" + current_page);

	}
	public void goBack() {
		if(!backward_stack.isEmpty()) {
			forward_stack.push(current_page);
			current_page=backward_stack.pop();
			System.out.println("The previous page is"+current_page);
		}else {
			System.out.println("you reached the home page");
		}
	}
	public void goforward() {
		if(!forward_stack.isEmpty()) {
			backward_stack.push(current_page);
			current_page=forward_stack.pop();
			System.out.println("The next page is"+current_page);
		}else {
			System.out.println("There is no more page");
		}
	}
	public String getcurrent_page() {
		return current_page;
		
	}
public void clear() {
	backward_stack.clear();
	forward_stack.clear();
	System.out.println("The history is detected");
}

	public static void main(String[] args) {
		WebHistory w = new WebHistory();
		System.out.println(w);
		w.visitpage("Flipcart");
		w.visitpage("shoee");
		System.out.println("*********************************");
		w.goBack();
		System.out.println("*********************************");
		w.goBack();
		System.out.println("***********************");
		
		w.goBack();
		System.out.println(w);
		

	}

}
