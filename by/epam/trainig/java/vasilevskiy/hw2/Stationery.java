package by.epam.trainig.java.vasilevskiy.hw2;

public abstract class Stationery implements Comparable {
	public String name;
	public int cost;
	public String color;

	public abstract void action();
	
//  Sorting from cost
	@Override
	public int compareTo(Object obj) {
		Stationery entry = (Stationery) obj;
		if (cost > entry.cost)
			return 1;
		else if (cost < entry.cost)
			return -1;
		else
			return 0;
	}
//  Sorting from name
//	@Override
//	public int compareTo(Object obj) {
//		Stationery entry = (Stationery) obj;
//		if (name > entry.name)
//			return 1;
//		else if (name < entry.name)
//			return -1;
//		else
//			return 0;
//	}

}
