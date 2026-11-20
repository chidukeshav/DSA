package Bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	private int id;
	private String Name;
	private double Sal;

	public Employee(int id, String name, double sal) {

		this.id = id;
		this.Name = name;
		this.Sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public double getSal() {
		return Sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Sal=" + Sal + "]";
	}
	
	public static void id(List<Employee>l) {
		for(int i=0;i<l.size();i++) {
			for(int j=0;j<l.size()-1-i;j++) {
				if(l.get(j).getId()>l.get(j+1).getId()) {
					Employee t=l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, t);
					
				}
			}
		}
		
	}
	public static void main(String[] args) {
		List<Employee>l=new ArrayList<Employee>(Arrays.asList(new Employee(3, "manoj", 50000),new Employee(2, "chidu", 50000),new Employee(1, "Sharath", 60000),new Employee(4, "Dinu", 70000)));
		//System.out.println(l);
		id(l);
		
//		for(int i=0;i<l.size();i++) {
//			for(int j=0;j<l.size()-1-i;j++) {
//				if(l.get(j).getName().compareTo(l.get(j+1).getName())>0) {
//					Employee t=l.get(j);
//					l.set(j,l.get(j+1));
//					l.set(j+1, t);
//					
//				}
//			}
//		}
		
//		for(int i=0;i<l.size();i++) {
//			for(int j=0;j<l.size()-1-i;j++) {
//				if(l.get(j).getId()>l.get(j+1).getId()) {
//					Employee t=l.get(j);
//					l.set(j, l.get(j+1));
//					l.set(j+1, t);
//					
//				}
//			}
//		}
	System.out.println(l);
	}

}
