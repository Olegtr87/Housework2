package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.Comparator;

/**
 * Class sorting objects by name
 * 
 * @author Oleg
 *
 */
public class CompByName implements Comparator<Stationery> {
	@Override
	public int compare(Stationery o1, Stationery o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
