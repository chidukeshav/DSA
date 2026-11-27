package quicksort;

import java.util.Arrays;

public class Main {
	
	public static int getPivote(int[]a,int li,int hi) {
		int pivote=hi;
		int j=li-1;
		for(int i=li;i<=hi;i++) {
			if(a[i]<=a[pivote]) {
				j++;
				int t= a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		return j;
	}
	
	public static void Divide(int[]a,int li,int hi) {
		if(li<hi) {
			int PivoteLocation= getPivote(a, li, hi);
			Divide(a, li, PivoteLocation-1);
			Divide(a, PivoteLocation+1, hi);
		}
	}
	public static void main(String[] args) {
		int[]a= {6,3,5,7,2,1,4};
		Divide(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
	}

}
