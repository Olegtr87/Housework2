package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.Comparator;

/**
 * Class sorting objects by cost
 * 
 * @author Oleg
 *
 */
public class CompByCost implements Comparator<Stationery> {
	@Override
	public int compare(Stationery o1, Stationery o2) {
		return o1.getCost() - o2.getCost();
	}
}
