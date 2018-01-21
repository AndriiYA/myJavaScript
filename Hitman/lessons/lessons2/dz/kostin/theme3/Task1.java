package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme3;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов
		 * без использования функции Math.toDegrees(n)..
		 */
		int a = 60;
		int b = 45;
		int c = 40;
		float a_60 = (float) Math.cos(Math.toRadians(a));
		float b_45 = (float) Math.cos(Math.toRadians(b));
		float c_40 = (float) Math.cos(Math.toRadians(c));
		System.out.println("косинус 60 = " + a_60);
		System.out.println("косинус 45 = " + b_45);
		System.out.println("косинус 40 = " + c_40);
	}

}
