package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample {
	public static void main(String[] args) {
		Consumer <Integer>consumer=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
	
		
		List<Integer>list=new ArrayList<>(Arrays.asList(23,19,61,78));
		//System.out.println(list);
		
//		for(int no:list) {
//			System.out.println(no);
//		}
		
		
//		list.forEach((no)->{
//			System.out.println(no);
//		});
		
		list.forEach(consumer);
	}
	

}
