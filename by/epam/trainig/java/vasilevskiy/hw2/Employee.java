package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.ArrayList ;

public class Employee {
	public String name;
	public ArrayList<Stationery> arrayStationery;
	
	public String getName() {
		return name;
	}
	public Employee(String name, ArrayList<Stationery> arrayStationery) {
		super();
		this.name = name;
		this.arrayStationery = arrayStationery;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Stationery> getSetStationery() {
		return arrayStationery;
	}
	public void setSetStationery(ArrayList<Stationery> setStationery) {
		this.arrayStationery = setStationery;
	}
	
}
