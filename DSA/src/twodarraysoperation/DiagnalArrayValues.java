package twodarraysoperation;

public class DiagnalArrayValues {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// sum
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++)
//
//		{
//			for (int j = 0; j < arr[i].length; j++) {
//				sum = sum + arr[i][j];
//			}
//			System.out.println("Sum is" + " " + sum);
//			System.out.println();
//
//		}

		// display even

//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(arr[i][j]%2==0) {
//					System.out.print(" " +arr[i][j]+" ");
//				}else {
//					System.out.print(" - ");
//				}
//				
//				
//			}
//			System.out.println();
//		}
//		System.out.println("*********************************************");
//		
//		//Display odd
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(arr[i][j]%2!=00) {
//					System.out.print(" "+arr[i][j]+" ");
//				}else {
//					System.out.print(" - ");
//				}
//			}
//			System.out.println();
//			
//		}

		//
//		for(int i=0;i<arr.length;i++) {
//			int sum1=0;
//			for(int j=0;j<arr[i].length;j++) {
//				
//					sum1=sum1+arr[i][j];
//					System.out.print(sum1+" ");
//				
//			}
//		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				sum = sum + arr[i][j];
				

			}
			System.out.println(sum);
		}
	}

}
