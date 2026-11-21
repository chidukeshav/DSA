package twodarraysoperation;

import java.util.Arrays;

public class Arraycreation {
	public static void main(String[] args) {
		
		//with new
//		int[][]arr=new int[2][3];
//		System.out.println(Arrays.deepToString(arr));
		
		//without new 
//		int[][]arr= {{1,2},{3,4}};
//		System.out.println(Arrays.deepToString(arr));
		
		//jagged Arrays
//		int[][]arr= new int[3][];
//		arr[0]=new int[2];
//		arr[1]=new int[3];
//		arr[2]=new int[] {4,5,6,7};
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//			
//		}
		
		
		//Display Arrays
		//int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//			
//		}
		
		//for each
//		for(int[]r:arr) {
//			for(int c:r) {
//			System.out.print(c+" ");
//			}
//			System.out.println();
//		}
//		
		
		//jaged for each
		int[][]arr= new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[] {4,5,6,7};
		for(int[]r:arr) {
			for(int c:r) {
			System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}
}
