package Bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_string {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(Arrays.asList("Manoj", "sharath", "dinu", "Chidu"));
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size() - 1 - i; j++) {
				if (l.get(j).compareTo(l.get(j + 1)) > 0) {
					String temp = l.get(j);
					l.set(j, l.get(j + 1));
					l.set(j + 1, temp);

				}

			}
		}
		System.out.println(l);
	}

}
