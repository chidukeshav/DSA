
package org.htc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	private final static int ID = 0;
	private final static int NAME = 1;
	private final static int SAL = 2;
	private final static int DESIGNATION = 3;
	private final static int YEAROFEXPER = 4;
	private final static int LOCATION = 5;
	private final static int GENDER = 6;
	private final static int EMAIL=7;

	private final static String[][] employees = {

			{ "101", "Asha", "85000", "Java Full Stack Developer", "5", "Hyderabad", "Female", "Asha@gmail.com" },
			{ "102", "Rahul", "92000", "Backend Developer", "7", "Bengaluru", "Male", "Rahul@gamil.com" },
			{ "103", "Sneha", "98000", "Java Full Stack Developer", "6", "Hyderabad", "Female", "Sneha@gamil.com" },
			{ "104", "Kiran", "76000", "Java Full Stack Developer", "4", "Hyderabad", "Male", "kirahjioyutrgfyuioioiouyhnjn@gmail.com" },
			{ "105", "Divya", "88000", "QA Engineer", "8", "Chennai", "Female", "@Divaya@gmail.com" },
			{ "106", "Arjun", "105000", "Technical Lead", "10", "Pune", "Male", "Arjun@gmail.com" },
			{ "107", "Priya", "91000", "Java Full Stack Developer", "9", "Hyderabad", "Female","p.ri.ya@gmail.com" },

	};

	public static void main(String[] args) {
		System.out.println("max sal");
		getMaxSalary();
		System.out.println("femal exp");
		getFemaleMaxExp();
		System.out.println("location");
		getEmpDesignationLocation();
		System.out.println("-----Male------");
		getMaleEmployees();
		System.out.println("-----Not Hydrebad------");
		getEmpLocNotHyd();
		System.out.println("************************************");
		getEmpEmail();

	}

	public static void getMaxSalary() {
		Optional<String[]> maxSalary = Arrays.stream(employees)
				.max(Comparator.comparingDouble(emp -> Double.parseDouble(emp[SAL])));
		maxSalary.ifPresent(MainClass::displayEmpDetails);
	}

	public static void getFemaleMaxExp() {
		Optional<String[]> maxExp = Arrays.stream(employees).filter(emp -> emp[GENDER].equalsIgnoreCase("Female"))
				.max(Comparator.comparingInt(emp -> Integer.parseInt(emp[YEAROFEXPER])));
		maxExp.ifPresent(MainClass::displayEmpDetails);
	}
	public static void getMaleEmployees() {
		List<String[]> maleEmployees = Arrays.stream(employees)
				.filter(emp -> emp[GENDER].equalsIgnoreCase("Male"))
				.collect(Collectors.toList());

		maleEmployees.forEach(emp -> displayEmpDetails(emp));
	}
	
	public static void getEmpLocNotHyd() {
		List<String[]> maleLocation = Arrays.stream(employees)
				.filter(emp -> !emp[LOCATION].equalsIgnoreCase("Hyderabad"))
				.collect(Collectors.toList());

		maleLocation.forEach(emp -> displayEmpDetails(emp));
	}


	public static void getEmpDesignationLocation() {
		List<String[]> empDesLoc = Arrays.stream(employees)
				.filter(emp -> emp[DESIGNATION].equalsIgnoreCase("Java Full Stack Developer"))
				.filter(emp -> emp[LOCATION].equalsIgnoreCase("Hyderabad")).collect(Collectors.toList());
		empDesLoc.forEach(emp -> displayEmpDetails(emp));

	}
	public static void getEmpEmail() {
		List<String[]> email = Arrays.stream(employees)
				.filter(emp -> !(emp[EMAIL].startsWith("@")||emp[EMAIL].length()>20||emp[EMAIL].length()<10||emp[EMAIL].replaceAll("[^.]","").length()>2)).collect(Collectors.toList());
		email.forEach(emp -> displayEmpDetails(emp));
		
		
	}

	static void displayEmpDetails(String[] emp) {
		System.out.println("Id:" + emp[ID] + "\t" + "Name:" + emp[NAME] + "\t" + "Salary:" + emp[SAL] + "\t"
				+ "Designation:" + emp[DESIGNATION] + "\t" + "Experience:" + emp[YEAROFEXPER] + "\t" + "Location:"
				+ emp[LOCATION] + "\t" + "Gender:" + emp[GENDER]+"\t"+"Email:"+emp[EMAIL]);
	}
}
