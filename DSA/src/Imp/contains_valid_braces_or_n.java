package Imp;

import java.util.Stack;

public class contains_valid_braces_or_n {
	public static String isvalidate(String s) {
		if(s.length()%2!=0) {
			return "Invalid of length";
		}
		Stack<Character>st=new Stack();
		for(char ch:s.toCharArray()) {
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}
			else if(st.isEmpty()) {
				return "Invalid Only Closing";
			}
			else {
				char val=st.pop();
				if((ch==')'&& val!='(')||
					(ch=='}'&& val!='{')||
					(ch==']'&& val!='[')){
					return "Invalid bcz of Mismatch";
				}
			}
		}
		if(st.isEmpty()) {
			return "valid braces";
		}else {
				return "Invalid bcz of opening";
			}
		}
		
	
	public static void main(String[] args) {
		String s="{[]]";
		System.out.println(isvalidate(s));

	}
}
