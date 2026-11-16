package Bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_int {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(6, 5, 1, 8, 2, 5, 8, 4, 3));
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size() - 1 - i; j++) {
				if (l.get(j) > l.get(j + 1)) {
					int temp = l.get(j);
					l.set(j, l.get(j + 1));
					l.set(j + 1, temp);
				}
			}
		}
		System.out.println(l);
	}

}
