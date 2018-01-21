package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * —оздайте программу, вычисл€ющую факториал натурального числа n,
		 * которое пользователь введЄт с клавиатуры.
		 */

		int n = 100;
		int rezult1 = 1;
		for (int i = 1; i <= n; i++) {
			rezult1 = rezult1 * i;
		}
		System.out.println(rezult1);
	}
}