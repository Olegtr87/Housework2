package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.ArrayList;

/**
 * Class contains name employee and array stationary from employee.
 * 
 * @author Oleg
 *
 */
public class Employee {
	private String name;
	private ArrayList<Stationery> arrayStationery;

	public Employee(String name, ArrayList<Stationery> arrayStationery) {
		super();
		this.name = name;
		this.arrayStationery = arrayStationery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Stationery> getArrayStationery() {
		return arrayStationery;
	}

	public void setArrayStationery(ArrayList<Stationery> arrayStationery) {
		this.arrayStationery = arrayStationery;
	}

}
