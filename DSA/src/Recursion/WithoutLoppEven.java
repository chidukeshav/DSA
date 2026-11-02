package Recursion;

public class WithoutLoppEven {
	
	static void print(int no) {
		if(no==11) {
			return;
			
		}
		if(no%2==0) {
			System.out.println(no);
		}
		print(no+1);
	}
	public static void main(String[] args) {
		print(1);
		
	}

}
