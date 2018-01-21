package ua.Kharkov.Hitman.lessons5.dz.kostin.theme9;

public class Task1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.9
		int[] mas = new int[20];
		int a = 10, b = 15;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = Task1.rand(a, b);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println();

		// 2.9 i 3.9
		int[] mas1 = new int[10], mas2 = new int[10], mas3 = new int[10], mas4 = new int[10], mas5 = new int[10];
		int a1 = 10, b1 = 15;

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = Task1.rand2(a1, b1);
			System.out.print(mas1[i] + " ");
		}
		System.out.println("");
		Task1.bubble(mas1);
		Task1.print(mas1);
		System.out.println("");
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = Task1.rand2(a1, b1);
			System.out.print(mas2[i] + " ");
		}
		System.out.println("");
		Task1.bubble(mas2);
		Task1.print(mas2);
		System.out.println("");
		System.out.println();

		for (int i = 0; i < mas3.length; i++) {
			mas3[i] = Task1.rand2(a1, b1);
			System.out.print(mas3[i] + " ");
		}
		System.out.println("");
		Task1.bubble(mas3);
		Task1.print(mas3);
		System.out.println("");
		System.out.println();

		for (int i = 0; i < mas4.length; i++) {
			mas4[i] = Task1.rand2(a1, b1);
			System.out.print(mas4[i] + " ");
		}
		System.out.println("");
		Task1.bubble(mas4);
		Task1.print(mas4);
		System.out.println("");
		System.out.println();

		for (int i = 0; i < mas5.length; i++) {
			mas5[i] = Task1.rand2(a1, b1);
			System.out.print(mas5[i] + " ");
		}
		System.out.println("");
		Task1.bubble(mas5);
		Task1.print(mas5);
		System.out.println("");
		System.out.println();
		
		//4.9

		String[] name = { "Пушкин", "Лермонтов", "Некрасов", "Толстой",
				"Л. Н. Толстой", "А. Н. Есенин", "Паустовский" };
		Task1.sort(name);
		for (String d : name)
			System.out.println(d);

	}
}