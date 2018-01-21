package ua.Kharkov.Hitman.lessons18;

import java.util.Scanner;

import ua.Kharkov.Hitman.lessons4.dz.Car.Audi;

public class AudiTest {

	/*
	 * 3. Определить класс, хранящий такую информацию о пользователе библиотеки:
	 * ФИО, номер читательского билета, факультет, дата рождения, телефон.
	 * Доступ к данным класса организовать посредством соответствующих
	 * функций-членов. Разработать программу, в которой создается массив
	 * объектов данного класса. В программе организовать: – ввод данных о
	 * читателях; – вывод данных массива на экран; – поиск (по фамилии или
	 * факультету) и вывод информации о читателях;
	 */
	public static void main(String[] args) {
		Audi[] cars = new Audi[3];

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < cars.length; i++) {
			Audi a = new Audi();

			// TODO println: enter color
			String temp = scanner.nextLine();
			a.setColor(temp);

			// TODO println: enter mark
			temp = scanner.nextLine();
			a.setMark(temp);

			// TODO println: enter V
			int v = Integer.valueOf(scanner.nextLine());
			a.setV(v);

			cars[i] = a;
		}

		for (Audi a : cars) {
			System.out.println(a);
		}

		// TODO println: enter search string
		String search = scanner.nextLine();

		for (Audi a : cars) {
			if (a.getMark().contains(search)) {
				System.out.println(a);
			}
		}
		
	}
}
