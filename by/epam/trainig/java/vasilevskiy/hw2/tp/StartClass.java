package by.epam.trainig.java.vasilevskiy.hw2.tp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import by.epam.trainig.java.vasilevskiy.hw2.*;

/**
 * Class create employee with array stationery, calculate and show cost
 * stationery an employee. Sorting arrays from Comparator.
 * 
 * @author Oleg
 *
 */
public class StartClass {
	private static Department dep;
	private static String nameEmployee;
	private static ArrayList<Stationery> arrayForOleg;
	public static final String ENTER_NAME = "Введите имя сотрудника: ";
	public static final String NOT_NAME = "Сотрудника с таким именем не существует!";

	public static void main(String[] args) {
		addEmployee();
		nameInConsole();
		summ(dep, nameEmployee);
	}

	// Add employee and stationery for employee
	private static void addEmployee() {
		arrayForOleg = new ArrayList<Stationery>();
		arrayForOleg.add(new Pen("Parker", 10000, "Red", "Blue"));
		arrayForOleg.add(new Knife("Blade", 5000, "Yellow", 2));
		arrayForOleg.add(new Pencil("Mark", 15000, "Green", "Black"));
		Employee oleg = new Employee("Oleg", arrayForOleg);
		dep = new Department();
		dep.getArrayEmployee().add(oleg);
	}

	// Test sorting array with Comparator
	private void testSort() {
		// Sorting test
		Stationery[] array = new Stationery[3];
		arrayForOleg.toArray(array);
		Arrays.sort(array, new CompByName());
		// Arrays.sort(array, new CompByCost());
		// Arrays.sort(array, new CompByCostAndName());
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getName());
		}

	}

	// Enter name employee from console
	private static void nameInConsole() {
		System.out.print(ENTER_NAME);
		Scanner scanner = new Scanner(System.in);
		nameEmployee = scanner.nextLine();
	}

	// Show summ stationery for employee
	private static void summ(Department dep, String nameEmployee) {
		int summ;
		for (Employee em : dep.getArrayEmployee()) {
			summ = 0;
			if (em.getName().equals(nameEmployee)) {
				for (Stationery st : em.getArrayStationery()) {
					summ = summ + st.getCost();
				}
				System.out.println("У сотрудника " + em.getName() + " стоимость канцтоваров " + summ);
			} else
				System.out.println(NOT_NAME);
		}
	}
}
