package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task14 {

	public static void main(String[] args) {
		/*
		 * В городе N есть большой склад на котором существует 50000 различных
		 * полок. Для удобства работников руководство склада решило заказать для
		 * каждой полки табличку с номером от 00001 до 50000 в местной
		 * типографии, но когда таблички напечатали, оказалось что печатный
		 * станок из-за неисправности не печатал цифру 2, поэтому все таблички,
		 * в номерах которых содержалась одна или более двойка (например, 00002
		 * или 20202) — надо перепечатывать. Напишите программу, которая
		 * подсчитает сколько всего таких ошибочных табличек оказалось в
		 * бракованной партии.
		 */

		// int brak = 0;
		// int tablichki =50000;
		// boolean hasTwo = false;
		// for (int i = 0; i <= tablichki; i++) {
		// int j = i;
		// hasTwo = false;
		// while (j > 0) {
		// if (j % 10 == 2) {
		// hasTwo = true;
		// break;
		// }
		// j = j / 10;
		// }
		// if (hasTwo)
		// brak++;

		// }
		// System.out.println(brak);

		int x = 24;
		int a, b, c;
		b = 0;
		for (int i = 1; i <= x; i++) {
			c = i;
			a = 0;
			while (c != 0) {
				if (c % 10 == 2) {
					a = 1;
					break;
				}
				c = c / 10;
			}
			if (a == 0) {
				b++;
			}
		}
		System.out.println(x - b + " - brak tablic");

	}

}
