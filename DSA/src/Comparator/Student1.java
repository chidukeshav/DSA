package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student1 {
	String name;
	int age;
	Student1(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		//Comparator<Student>com=(Student a,Student b)->(a.age>b.age)?1:-1;
		Comparator<Student1>com=(Student1 a,Student1 b)->a.name.compareTo(b.name);
		
		Student1 s1=new Student1("Mithun",25);
		Student1 s2=new Student1("Sharath",23);
		
		List<Student1>l=new ArrayList<Student1>(Arrays.asList(s1,s2));
		Collections.sort(l,com);
		
		l.forEach((no)->System.out.println(no));
	}
	
	

}
