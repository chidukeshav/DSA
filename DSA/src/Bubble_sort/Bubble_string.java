package Bubble_sort;

import java.util.Arrays;

public class Bubble_string {
	public static void main(String[] args) {
		String[] s = { "sharath", "chidu", "manoj", "dinu" };
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].compareTo(s[j + 1]) > 0) {
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(s));
	}
}
