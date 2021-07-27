package com.training.airproject.main;

import java.util.Scanner;

import com.training.airproject.bean.Airline;
import com.training.airproject.list.Board;

public class FlightsInspector {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Board plane = new Board();
		plane.add(new Airline("Moscow", 1, "SSJ", 5, new String[] { "Monday", "Wednesday", "Friday" }));
		plane.add(new Airline("Berlin", 2, "Boeing", 8, new String[] { "Tuesday", "Thursday" }));
		plane.add(new Airline("New York", 3, "Airbus", 11, new String[] { "Suturday", "Sunday", "Friday" }));
		plane.add(new Airline("Milan", 4, "Boeing", 3, new String[] { "Monday", "Saturday" }));
		plane.add(new Airline("Paris", 5, "Airbus", 8, new String[] { "Monday", "Thursday", "Friday" }));
		 
		
		while (true) {
			System.out.println("Для продолжения работы выберите интересующий вас пункт: ");
			System.out.println("1. - для поиска рейсов по пункту назначения;");
			System.out.println("2. - для поиска рейсов по дням недели;");
			System.out.println("3. - для поиска рейсов по дню и времени;");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Введите пункт назначения: ");
				String inputDest = sc.next();
				System.out.println(plane.findByDestination(inputDest));
				break;
			case 2:
				System.out.println("Введите интересующий день недели: ");
				String inputDay = sc.next();
				switch(inputDay) {
				case "Monday":
					System.out.println(plane.findByDepDays("Monday"));
					break;
				case "Tuesday":
					System.out.println(plane.findByDepDays("Tuesday"));
					break;
				case "Wednesday":
					System.out.println(plane.findByDepDays("Wednesday"));
					break;
				case "Thursday":
					System.out.println(plane.findByDepDays("Thursday"));
					break;
				case "Friday":
					System.out.println(plane.findByDepDays("Friday"));
					break;
				case "Suturday":
					System.out.println(plane.findByDepDays("Suturday"));
					break;
				case "Sunday":
					System.out.println(plane.findByDepDays("Sunday"));
					break;
				}
				break;
			case 3:
				System.out.println("Введите интересующий день недели и время (Час p.m.), после которого начать поиск: ");
				System.out.print("Время (Час p.m.): "); 
				int inputTime = sc.nextInt(); 
				System.out.print("День недели: "); 
				String inputDayT = sc.next();
				switch(inputDayT) {
				case "Monday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Monday"));
					break;
				case "Tuesday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Tuesday"));
					break;
				case "Wednesday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Wednesday"));
					break;
				case "Thursday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Thursday"));
					break;
				case "Friday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Friday"));
					break;
				case "Suturday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Suturday"));
					break;
				case "Sunday":
					System.out.println(plane.findByAfterXDepTime(inputTime, "Sunday"));
					break;
					default:
					System.out.println("Некорректный ввод!");
					continue;	
				}
				break;
	
			default: 
					System.out.println("Некорректный ввод!");
					continue;
			}
		 }
	}

}
