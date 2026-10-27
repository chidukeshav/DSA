package Imp;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
	public static void main(String[] args) {
		String s="abcabcbd";
		int j=0,max=0;
		
		Set<Character> st=new HashSet();
		for(int i=0;i<s.length();i++) {
			while(st.contains(s.charAt(i))) {
				st.remove(s.charAt(j));
				j++;
			}
			st.add(s.charAt(i));
			max=Math.max(i-j+1, max);
		}
		System.out.println(max);
		
	}

}
