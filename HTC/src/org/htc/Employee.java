package org.htc;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private String designation;
	private String yearOfExper;
	private String location;
	private String gender;

	public Employee(int id, String name, double sal, String designation, String yearOfExper, String location,
			String gender) {

		this.id = id;
		this.name = name;
		this.sal = sal;
		this.designation = designation;
		this.yearOfExper = yearOfExper;
		this.location = location;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	public String getDesignation() {
		return designation;
	}

	public String getYearOfExper() {
		return yearOfExper;
	}

	public String getLocation() {
		return location;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", designation=" + designation
				+ ", yearOfExper=" + yearOfExper + ", location=" + location + ", gender=" + gender + "]";
	}

}
