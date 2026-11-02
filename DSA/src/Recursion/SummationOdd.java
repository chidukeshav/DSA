package Recursion;

public class SummationOdd {
	static int sum(int no) {
		if(no<=0) {
			return 0;
			
		}
		if(no%2==0) {
			no=no-1;
		}
		return no+sum(no-2);
	}

	public static void main(String[] args) {
		System.out.println(sum(7));
	}

}
