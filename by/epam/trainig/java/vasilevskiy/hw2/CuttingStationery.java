package by.epam.trainig.java.vasilevskiy.hw2;

public abstract class CuttingStationery extends Stationery {	
	public int numberBlades;
	
	@Override
	public void action() {
		System.out.println("Режу");
	}
}
