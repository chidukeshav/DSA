package Recursion;

public class SummationEven {
	static int sum(int no) {
		if(no==0) {
			return 0;
		}
		if(no%2==0) {
			return no+sum(no-2);
		}
		return no;
	}
	public static void main(String[] args) {
		System.out.println(sum(6));
	}

}
