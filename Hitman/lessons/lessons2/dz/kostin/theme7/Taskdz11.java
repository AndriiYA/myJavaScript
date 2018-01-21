package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Taskdz11 {

	public static void main(String[] args) {
		/*
		 * 1.6. Разместить в памяти массив из 20 элементов и заполнить его рядом
		 * Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, … В этом ряду каждое следующее
		 * число является суммой двух предыдущих.
		 * 
		 * 
		 * int[] mas = new int[10]; for(int i=0,n=2; i<mas.length; n=n+2,i++){
		 * mas[i] = n; } for(int i=0; i<mas.length; i++) {
		 * System.out.print(mas[i]+" "); } System.out.println(); for(int i=0;
		 * i<mas.length; i++) { System.out.println(mas[i]); }
		 */
		// int a = 1, b = 1;

		// System.out.print(a + " " + b);
		// int[] mas = new int[18];
		// for (int i = 0; i < mas[i]; i++) {
		// mas[i] = a + b;
		// a = b;
		// b = mas[i];
		// System.out.print(" " + mas[i]);

		// }

		int a = 1, b = 1;
		int n = 18;
		System.out.print(a + " " + b);
		int[] mas = new int[18];
		for (int i = 0; i < n; i++) {
			mas[i] = a + b;
			a = b;
			b = mas[i];
			System.out.print(" " + mas[i]);
		}

		/*
		 * int n1 = 1, n2 = 1, s = 0; System.out.print(n1 + " " + n2 + " "); for
		 * (int i = 0; i < 18; i++) { if (i % 2 == 0) { n1 = n1 + n2;
		 * System.out.print(n1 + " "); } else { n2 = n1 + n2;
		 * System.out.print(n2 + " "); } }
		 */
	}
}
