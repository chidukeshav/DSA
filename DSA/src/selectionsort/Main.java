package selectionsort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[]a= {5,3,4,6,1,2};
		for(int j=0;j<a.length;j++){
			int min=j;
			for(int i=j+1;i<a.length;i++) {
				if(a[i]<a[min]) {
					min=i;
				}
			}
			int t=a[j];
			a[j]=a[min];
			a[min]=t;
		}
		System.out.println(Arrays.toString(a));
	}

}
