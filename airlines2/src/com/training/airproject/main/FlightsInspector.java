package com.training.airproject.main;

import java.util.Scanner;

import com.training.airproject.bean.Airline;
import com.training.airproject.list.Board;

public class FlightsInspector {

	public static void main(String[] args) {
		
		//не вышло вынести в отдельный метод init();
		Board plane = new Board();
		plane.add(new Airline("Moscow", 1, "SSJ", 5, new String[] { "Monday", "Wednesday", "Friday" }));
		plane.add(new Airline("Berlin", 2, "Boeing", 8, new String[] { "Tuesday", "Thursday" }));
		plane.add(new Airline("New York", 3, "Airbus", 11, new String[] { "Suturday", "Sunday", "Friday" }));
		plane.add(new Airline("Milan", 4, "Boeing", 3, new String[] { "Monday", "Saturday" }));
		
		/* Проверка алгоритма поиска
		 * System.out.println(plane.findByDepDays("Sunday")); 
		 * System.out.println(plane.findByAfterXDepTime(1, "Tuesday"));
		 */
		
		try (//в идеале метод inputMenu();
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Для продолжения работы выберите интересующий вас пункт: ");
			System.out.println("1. - для поиска рейсов по пункту назначения;");
			System.out.println("2. - для поиска рейсов по дням недели;");
			System.out.println("3. - для поиска рейсов по дню и времени;");
			
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Некорректный ввод..Повторите: ");
			}
			int num = sc.nextInt();			
			if (num == 1) {
				System.out.println("Введите интересующий пункт назначения: ");
				sc.nextLine();
				String inputDest = sc.next();
				System.out.println(plane.findByDestination(inputDest));
				
				
			}else if (num == 2) {
				System.out.println("Введите интересующий день недели: ");
				sc.nextLine();
				String inputDay = sc.next();
				System.out.println(plane.findByDepDays(inputDay));
			}else if (num == 3) {
				System.out.println("Введите интересующий день недели и время (Час p.m.), после которого начать поиск: ");
				System.out.print("Время (Час p.m.): ");
				sc.nextLine();
				int inputTime = sc.nextInt();
				System.out.print("День недели: ");
				sc.nextLine();
				String inputDay = sc.next();
				System.out.println(plane.findByAfterXDepTime(inputTime, inputDay));
			}else {
				System.out.println("Неверный код, начните заново. ");
			}
		}
		
	}

}