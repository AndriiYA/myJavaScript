package ua.Kharkov.Hitman.matharrayhelper;

public class MathArrayHelper {

	/**
	 * 
	 * Проверка числа (четное, или не четное) Method returns true if the number
	 * is even
	 * 
	 * @param number
	 *            - the number to determine
	 * @return true if the number is even and false if not
	 */

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}

	/**
	 * 1.4. Эта программа подсчитывает факториал натурального числа "n"
	 * 
	 * @param This
	 *            program calculates the factorial of natural number "n"
	 * @return Factorial natural number "n"
	 */

	public static int factorial(int number) {
		int rezult = 1;
		for (int i = 1; i <= number; i++) {
			rezult = rezult * i;
		}
		return rezult;
	}

	/**
	 * 1.1. Написать программу, которая находит наибольший общий делитель двух
	 * целых положительных чисел.
	 * 
	 * @param Write
	 *            a program that finds the greatest common divisor of two
	 *            positive integers.
	 * @return Program that finds the greatest common divisor of two positive
	 *         integers.
	 */

	public static int GetMostCommonDivisor(int chi1, int chi2) {
		int a, b, r;
		if (chi1 > chi2) {
			a = chi1;
			b = chi2;
		} else {
			b = chi1;
			a = chi2;
		}
		if (b == 0)
			return a;
		do {
			r = a % b;
			a = b;
			b = r;
		} while (r != 0);
		return a;
	}

	/**
	 * 1.2. Написать программу, которая находит сумму цифр произвольного целого
	 * числа.
	 * 
	 * @param Write
	 *            a program that finds the sum of digits of arbitrary integer.
	 * @return program that finds the sum of digits of arbitrary integer.
	 */
	public static int calcDigits(int number) {
		int summa = 0;
		for (; number != 0; number /= 10) {
			summa = summa + (number % 10);
		}
		return summa;
	}

	/**
	 * 1.6. Разместить в памяти массив из 20 элементов и заполнить его рядом
	 * Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, … В этом ряду каждое следующее
	 * число является суммой двух предыдущих.
	 * 
	 * @param To
	 *            place an in-memory array of 20 elements and fill it near
	 *            Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, ... In this series each
	 *            successive number is the sum of the previous two.
	 * @return Array of 20 elements and fill it near Fibonacci: 1, 1, 2, 3, 5,
	 *         8, 13, 21, ... In this series each successive number is the sum
	 *         of the previous two.
	 */

	/*
	 * public static int[]fibonachi(int arrayLength) { int a = 1, b = 1; int[]
	 * mas = new int[arrayLength]; mas[0] = 1; mas[1] = 1; for (int i = 2; i <
	 * mas.length; i++) { mas[i] = a + b; a = b; b = mas[i]; } return mas; }
	 */
	public static int[] fibonachi2(int arrayLength) {

		int[] arr = new int[arrayLength];
		arr[0] = 1;
		arr[1] = 1;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(arr[i]);
		}
		return arr;

	}

	/**
	 * 1.7. Создать целый массив из 100 элементов и заполнить его простыми
	 * числами: 2, 3, 5, 7, 11, 13, 17, …
	 * 
	 * @param The
	 *            program creates a whole array of 100 elements and fills it
	 *            with primes: 2, 3, 5, 7, 11, 13, 17, ...
	 * @return The program displays a wide array of 100 elements and fills it
	 *         with primes: 2, 3, 5, 7, 11, 13, 17, ...
	 */

	public static int[] simpleNumber(int length) {
		int[] ar = new int[length];
		for (int i = 0, n = 1; i < ar.length; n = n + 1, i++) {
			ar[i] = n;
		}
		return ar;
	}

	/**
	 * Вывод массива на экран
	 * 
	 * @param Conclusion
	 *            of the array to the screen
	 * 
	 * @return Conclusion of the array to the screen
	 */

	public static void print(int ar[]) {
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");

	}

	/**
	 * 1.3. Проверяем простое или сложное число
	 * 
	 * @param Check
	 *            simple or complex number
	 * @return We derive a simple or complex number
	 */
	public static boolean isSimple(int numb) {
		@SuppressWarnings("unused")
		boolean isSimple = true;
		for (int i = 2; i < numb; i++) {
			if (numb % i == 0) {
				return false;
			}
		}
		return true;

	}

	/**
	 * 1.8. Метод сортировки массива пузырьком
	 * 
	 * @param The
	 *            sort method of the array bubble
	 * @return Sorts the array bubble
	 * 
	 */
	public static void bubble(int array[]) {
		for (int i = 0; i < array.length; i++) {
		}
		for (int i = array.length - 1; i >= 0; i--) {
			for (int index = 0; index < i; index++) {
				if (array[index] > array[index + 1]) {
					int tmp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tmp;
				}
			}
		}
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	/**
	 * 1.9 Метод, который отсортирует и выведет на экран строки в алфавитном
	 * порядке.
	 * 
	 * @param The
	 *            method that will sort and display the strings in alphabetical
	 *            order.
	 * 
	 * @return Displays the line in alphabetical order.
	 * 
	 */
	public static void SortAlphabeticalOrder(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					String tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					for (String d : array)
						System.out.println(d);
				}
			}
		}
	}

	/**
	 * 1.10 Метод, который имеет два целочисленных параметра a и b, и в качестве
	 * своего значения возвращает случайное целое число из отрезка [a;b]. И
	 * заполняет массив случайными числами из этого отрезка.
	 * 
	 * @param Method
	 *            fills the array with the numbers of the parting of the two
	 *            numbers.
	 * 
	 * @returne Method fills the array with the numbers of the parting of the
	 *          two numbers.
	 */
	public static int rand(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + (a));

	}

	public int sum(int[] array) {
		int rezult = 0;
		for (int i = 0; i < array.length; i++) {
			rezult = rezult + array[i];

		}
		return rezult;
	}
}
