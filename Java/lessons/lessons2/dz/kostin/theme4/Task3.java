package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme4;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * ¬ три переменные a, b и c записаны три вещественных числа. —оздать
		 * программу, котора€ будет находить и выводить на экран вещественные
		 * корни квадратного уравнени€ a*(x*x)+b*x+c=0, либо сообщать, что
		 * корней нет.
		 */

		double a = 3;
		double b = -13;
		double c = 6;
		double D = (b * b) - 4 * a * c;
		double x1 = (-b + Math.sqrt(D)) / c * a;
		double x2 = (-b - Math.sqrt(D)) / c * a;
		System.out.println("D = " + D);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		boolean netkorneyx1 = x1 < 0;
		boolean netkorneyx2 = x2 < 0;
		System.out.println("net korney - " + netkorneyx1);
		System.out.println("net korney - " + netkorneyx2);

	}

}
