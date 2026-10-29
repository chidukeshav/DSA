package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student2 {
String name;
int marks;
double cgpa;

Student2(String name,int marks,double cgpa){
	this.name=name;
	this.marks=marks;
	this.cgpa=cgpa;
}



@Override
public String toString() {
	return "Student2 [name=" + name + ", marks=" + marks + ", cgpa=" + cgpa + "]";
}



public static void main(String[] args) {
	Comparator<Student2> com=(Student2 a,Student2 b)->(a.cgpa>b.cgpa)?1:-1;
	Student2 s1=new Student2("Mithun",87,8.1);
	Student2 s2=new Student2("Revanth",67,8.3);
	
	List<Student2>l=new ArrayList<Student2>(Arrays.asList(s1,s2));
	Collections.sort(l,com);
	
	l.forEach((no)->System.out.println(no));
}
}
