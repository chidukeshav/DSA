package Recursion;

public class withoutloopReverse {
	static void print(int no) {
		if(no==0) {
			return;
		}
		System.out.println(no);
		print(no-1);
		
	}
	public static void main(String[] args) {
		print(10);
		
	}

}
