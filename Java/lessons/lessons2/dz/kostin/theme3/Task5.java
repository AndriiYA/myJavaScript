package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Создайте программу, которая будет генерировать и выводить на экран
		 * вещественное псевдослучайное число из промежутка [-3;3).
		 */
		int min = -3;
		int max = 3;
		System.out.println("Вещественное псевдослучайное число" + ":"
				+ (Math.random() * (max - min) + min));

	}

}
