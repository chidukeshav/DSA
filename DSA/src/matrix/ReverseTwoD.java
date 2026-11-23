package matrix;

import java.util.Arrays;

public class ReverseTwoD {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int r = 0; r < a.length; r++) {
			int left = 0, right = a[r].length - 1;
			while (left < right) {
				int temp = a[r][left];
				a[r][left] = a[r][right];
				a[r][right] = temp;
				left++;
				right--;

			}
			
		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;i++) {
//				System.out.println(a[i][j]);
//			}
//			System.out.println();
//		}
	}

}
