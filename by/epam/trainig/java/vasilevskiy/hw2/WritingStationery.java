package by.epam.trainig.java.vasilevskiy.hw2;

/**
 * Abstract class WritingStationery. Contains variable colorWriting and method
 * action.
 * 
 * @author Oleg
 *
 */
public abstract class WritingStationery extends Stationery {
	private String colorWriting;

	public String getColorWriting() {
		return colorWriting;
	}

	public void setColorWriting(String colorWriting) {
		this.colorWriting = colorWriting;
	}

	@Override
	public void action() {
		System.out.println("Пишу");
	}
}
