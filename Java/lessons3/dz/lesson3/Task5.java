package ua.Kharkov.Hitman.lessons3.dz.lesson3;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * int mons_day []; mons_day = new int[12]; mons_day [0] = 31; mons_day
		 * [1]= 30; mons_day [2]= 29; System.out.println("v yanvare " + mons_day
		 * [0]+ " dney"); int mons_day[] = { 31, 30, 29, 30, 31 };
		 * System.out.println("v yanvare " + mons_day[0] + " dney");
		 * 
		 * double nums[] = { 10.1, 13.3, 11.8, 67, 4 }; double result = 0; int
		 * i; for (i = 0; i < 4; i++) result = result + nums[i];
		 * System.out.println("srednee znachenie ravno  " + result / 4);
		 * 
		 * int twod[][] = new int[4][5]; int i, j, k = 0;
		 * 
		 * for (i = 0; i < 4; i++) for (j = 0; j < 5; j++) { twod[i][j] = k;
		 * k++; } for (i = 0; i < 4; i++) { for (j = 0; j < 5; j++)
		 * System.out.print(twod[i][j] + " "); System.out.println(); }
		 * 
		 * int twod[][] = new int[4][]; twod[0] = new int[1]; twod[1] = new
		 * int[2]; twod[2] = new int[3]; twod[3] = new int[4]; int i, j, k = 0;
		 * for (i = 0; i < 4; i++) for (j = 0; j < i + 1; j++){ twod[i][j] = k;
		 * k++; } for (i = 0; i < 4; i++){ for (j = 0; j < i + 1; j++)
		 * System.out.print(twod[i][j] + " "); System.out.println(); }
		 */

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println(" ");

		}
	}

}
