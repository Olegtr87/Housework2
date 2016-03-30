package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.Comparator;

/**
 * Class Stationery. Contains name, cost, color.
 * 
 * @author Oleg
 *
 */
public abstract class Stationery {
	private String name;
	private int cost;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void action();
}
