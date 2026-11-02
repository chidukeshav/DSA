package Recursion;

public class SummationEven {
	static int sum(int no) {
		if(no<=0) {
			return 0;
		}
		if(no%2==0) {
			no=no-1;
		}
		return no+1+sum(no-1);
	}
	public static void main(String[] args) {
		System.out.println(sum(6));
	}

}
