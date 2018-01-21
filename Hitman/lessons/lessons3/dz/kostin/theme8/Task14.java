package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task14 {

	public static void main(String[] args) {
		/*
		 * Сложение двух матриц
		 */

		// int a[][] = { { 1, 2, 3 },
		// { 4, 5, 6 },
		// { 7, 8, 9 } };
		//
		// int b[][] = { { 1, 2, 3 },
		// { 4, 5, 6 },
		// { 7, 8, 9 } };
		//
		// int c[][] = new int[3][3];
		// System.out.print("Матрица: ");
		// System.out.println();
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++)
		// System.out.print(a[i][j] + " ");
		// System.out.println();
		// }
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++)
		// c[i][j] = a[i][j] + b[i][j];
		// }
		// System.out.println();
		// System.out.println("Результат :");
		// System.out.println();
		//
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// System.out.print(c[i][j] + " ");
		// }
		// System.out.println();
		// }

		// умножение матрицы на число
		// int[][] matr = new int[3][];
		// int n = 2;
		// for (int i = 0; i < matr.length; i++) {
		// matr[i] = new int[3];
		// for (int j = 0; j < matr[i].length; j++) {
		// matr[i][j] = (int) Math.round(Math.random() * 100);
		// System.out.print(matr[i][j]+" ");
		// }
		// System.out.println();
		// }
		// System.out.println("Rezult: ");
		// for (int i = 0; i<matr.length; i++){
		// for(int j =0; j<matr[i].length; j++){
		// matr [i] [j]*=n;
		// System.out.print(matr[i][j]+ " ");
		// }
		// System.out.println();
		//
		//
		// }
		// // Умножение матрицы на число
		// int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// int n = 2;
		// for (int i = 0; i < A.length; i++) {
		// for (int j = 0; j < A.length; j++) {
		// A[i][j] *= n;
		// System.out.print(A[i][j] + " ");
		// }
		// System.out.println();
		// }

		// Транспонирование матрицы
		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = new int[3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				B[i][j] = A[j][i];
			}
		}

		System.out.println();
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

	}

}
