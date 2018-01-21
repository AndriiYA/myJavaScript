package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme2;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * В переменных q и w хранятся два натуральных числа. Создайте
		 * программу, выводящую на экран результат деления q на w с остатком.
		 * Пример вывода программы (для случая, когда в q хранится 21, а в w
		 * хранится 8):
		 * 
		 * 21 / 8 = 2 и 5 в остатке
		 */
		int q = 78, w = 8;
		System.out.println("");
		System.out.println(q + " / " + w + " = " + (q / w) + " i "
				+ ((int) (((q / w) + 0.5) * 10) % 10) + " v ostatke ");
	}
}
