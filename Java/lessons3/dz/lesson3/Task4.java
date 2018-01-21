package ua.Kharkov.Hitman.lessons3.dz.lesson3;

public class Task4 {

	public static void main(String[] args) {
		// Заменить на "0" четное число в массиве

		/*
		 * int[] array; array = new int [] {1,2,4,4};
		 * 
		 * for (int index = 0; index < array.length; index++) { if (array[index]
		 * % 2 == 0) {
		 * 
		 * array[index] = 0; } System.out.print(array[index] + " ");
		 * 
		 * }
		 */

		/*
		 * int[] mas = new int[100]; for(int i=0,n=1; i<mas.length; n=n+1,i++){
		 * mas[i] = n; } System.out.print(mas[i]+" ");
		 */

		int[] ar = new int[15];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 10);
			System.out.print(ar[i] + " ");
		}

	}
}
