package Bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employeetwo {
	String name;
	int id;
	String adress;

	public Employeetwo(String name, int id, String adress) {

		this.name = name;
		this.id = id;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employeetwo [name=" + name + ", id=" + id + ", adress=" + adress + "]";
	}

	public static void main(String[] args) {
		List<Employeetwo> l = new ArrayList<Employeetwo>(Arrays.asList(new Employeetwo("chidu", 3, "Hassan"),new Employeetwo("Anu", 1, "Bmgle")));
		
	
	}

}
