package ua.Kharkov.Hitman.matharrayhelper.test;

import ua.Kharkov.Hitman.matharrayhelper.MathArrayHelper;

public class MathArrayHelperTest {
	public static void main(String[] args) {

		// Выводит четное число или не четное
		int chislo1 = 23;
		boolean chislo = MathArrayHelper.isEven(chislo1);
		System.out.println(chislo1 + " " + chislo);

		// 1.4. Выводит факториал числа n
		int n = 5050;
		int num = MathArrayHelper.factorial(n);
		System.out.println("Факториал числа n = " + num);

		// 1.1. Написать программу, которая находит наибольший общий делитель
		// двух целых положительных чисел.
		int a = 3;
		int c = 6;
		MathArrayHelper.GetMostCommonDivisor(a, c);
		System.out.println(MathArrayHelper.GetMostCommonDivisor(a, c)
				+ " Наибольший общий делитель");

		// 1.2. Написать программу, которая находит сумму цифр произвольного
		// целого числа.
		int number = 100;
		int b = MathArrayHelper.calcDigits(number);
		System.out.println("sum of " + number + " = " + b);

		// 1.6. Разместить в памяти массив из 20 элементов и заполнить его рядом
		// Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, … В этом ряду каждое следующее
		// число
		// является суммой двух предыдущих.

		// int mas[] = MathArrayHelper.fibonachi(20);
		// for (int i = 0; i < mas.length; i++) {

		// System.out.print(mas[i] + " ");
		// }
		// System.out.println();
		// MathArrayHelper.print(mas);
		int array[] = MathArrayHelper.fibonachi2(6);
		System.out.println();
		System.out.print(array);
		System.out.println();

		// 1.7. Создать целый массив из 100 элементов и заполнить его простыми
		// числами: 2, 3, 5, 7, 11, 13, 17, …

		int ar[] = MathArrayHelper.simpleNumber(100);
		MathArrayHelper.print(ar);
		System.out.println();

		// 1.3. Проверяем простое или сложное число
		int x = 9;
		MathArrayHelper.isSimple(x);
		System.out.println(MathArrayHelper.isSimple(x));
		System.out.println();

		// 1.10. Метод, который имеет два целочисленных
		// параметра a и b, и в качестве своего значения возвращает случайное
		// целое
		// число из отрезка [a;b]. И заполняет массив случайными числами из
		// этого отрезка.

		int[] mas1 = new int[10];
		int a1 = 10, b1 = 15;
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = MathArrayHelper.rand(a1, b1);
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
		System.out.println();
	

		// 1.8. Сортировка массива пузырьком
		MathArrayHelper.bubble(mas1);
		System.out.println();

	}

}
