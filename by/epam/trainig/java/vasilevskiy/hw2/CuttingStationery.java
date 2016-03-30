package by.epam.trainig.java.vasilevskiy.hw2;

/**
 * Abstract class CuttingStationery. Contains variable numberBlades and method
 * action.
 * 
 * @author Oleg
 *
 */
public abstract class CuttingStationery extends Stationery {
	private int numberBlades;

	public int getNumberBlades() {
		return numberBlades;
	}

	public void setNumberBlades(int numberBlades) {
		this.numberBlades = numberBlades;
	}

	@Override
	public void action() {
		System.out.println("Режу");
	}
}
