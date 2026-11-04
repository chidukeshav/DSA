package Recursion;

public class Permutation {
	static void perm(String s, String res) {
		if (s.isEmpty()) {
			System.out.println(res);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String remain = s.substring(0, i) + s.substring(i + 1);
			perm(remain, res + ch);

		}
	}

	public static void main(String[] args) {
		perm("DOG", "");
	}

}
