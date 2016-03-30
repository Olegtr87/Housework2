package by.epam.trainig.java.vasilevskiy.hw2.tp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import by.epam.trainig.java.vasilevskiy.hw2.*;

public class StartClass {
	private static Department dep;
	private static String nameEmployee;

	public static void main(String[] args) {
		addEmployee();
		nameInConsole();
		summ(dep, nameEmployee);
	}

	private static void addEmployee() {
		ArrayList<Stationery> arrayForOleg = new ArrayList<Stationery>();
		arrayForOleg.add(new Pen("Parker", 10000, "Red", "Blue"));
		arrayForOleg.add(new Knife("Blade", 5000, "Yellow", 2));
		arrayForOleg.add(new Pencil("Mark", 15000, "Green", "Black"));
//		 Sorting test
//		 Stationery[] array=new Stationery[3];
//		 arrayForOleg.toArray(array);
//		 Arrays.sort(array);
//		 for(int i = 0; i < array.length; i++)
//          {
//            System.out.println(array[i].cost);
//          }
		Employee oleg = new Employee("Oleg", arrayForOleg);
		dep = new Department();
		dep.arrayEmployee.add(oleg);
	}

	private static void nameInConsole() {
		System.out.print("Введите имя сотрудника: ");
		Scanner scanner = new Scanner(System.in);
		nameEmployee = scanner.nextLine();
	}

	// private static void sort(){
	//
	// }

	private static void summ(Department dep, String nameEmployee) {
		int summ;
		for (Employee em : dep.arrayEmployee) {
			summ = 0;
			if (em.name.equals(nameEmployee)) {
				for (Stationery st : em.arrayStationery) {
					summ = summ + st.cost;
				}
				System.out.println("Для сотрудника " + em.name + " стоимость канцтоваров " + summ);
			} else
				System.out.println("Сотрудника с таким именем не существует!");
		}
	}
}
