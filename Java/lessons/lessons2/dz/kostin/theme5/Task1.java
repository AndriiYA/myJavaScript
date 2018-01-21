package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme5;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Создать программу, которая будет проверять попало ли случайно
		 * выбранное из отрезка [5;155] целое число в интервал (25;100) и
		 * сообщать результат на экран. Примеры работы программы: Число 113 не
		 * содержится в интервале (25,100) Число 72 содержится в интервале
		 * (25,100)
		 */

		int min = 5;
		int max = 155;
		int n = (int) (Math.random() * (max - min) + min);
		System.out.print((" Число ") + n);
		if (n >= 25 && n < 100) {
			System.out.println(" содержится в интервале (25;100) ");
		} else {
			System.out.println(" не содержится в интервале (25;100)");
		}

	}

}
