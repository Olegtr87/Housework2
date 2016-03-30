package by.epam.trainig.java.vasilevskiy.hw2;

public abstract class WritingStationery extends Stationery {
	public String colorWriting;
	
	@Override
	public void action() {
		System.out.println("Пишу");
	}
}
