package by.epam.trainig.java.vasilevskiy.hw2;

import java.util.Comparator;

/**
 * Class sorting objects by cost and name
 * 
 * @author Oleg
 *
 */
public class CompByCostAndName implements Comparator<Stationery> {
	@Override
	public int compare(Stationery o1, Stationery o2) {
		int flag = o1.getCost() - o2.getCost();
		if (flag == 0)
			flag = o1.getName().compareTo(o2.getName()); // if flag==0 (cost1==cost2)
															// then sorting by name
		return flag;
	}
}
