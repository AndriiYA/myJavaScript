package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task9 {

	public static void main(String[] args) {
		/*
		 * —оздайте два массива из 10 целых случайных чисел из отрезка [1;9] и
		 * третий массив из 10 действительных чисел.  аждый элемент с i-ым
		 * индексом третьего массива должен равн€тьс€ отношению элемента из
		 * первого массива с i-ым индексом к элементу из второго массива с i-ым
		 * индексом. ¬ывести все три массива на экран (каждый на отдельной
		 * строке), затем вывести количество целых элементов в третьем массиве.
		 */

		int mas[] = new int[10];
		int mas1[] = new int[10];
		double mas2[] = new double[10];
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.floor(Math.random() * 9 + 1);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) Math.floor(Math.random() * 9 + 1);
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + "; ");
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			mas2[i] = ((double) mas[i] / mas1[i]);
		}
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "; ");
			if (mas2[i] % 1 == 0) {
				j++;
			}
		}
		System.out.println("\n Kolichestvo tselih elementov v massive 3 ravno "
				+ j);

	}
}
