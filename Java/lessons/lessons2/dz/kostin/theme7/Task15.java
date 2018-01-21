package ua.Kharkov.Hitman.lessons.lessons2.dz.kostin.theme7;

public class Task15 {

	public static void main(String[] args) {

		 int m, j, s1, s2; // ot 1000 000 do 999 999
		 j = 0;
		 for (int i = 1000; i <= 9999; i++) {
		 m = i / 1000;
		 s1 = 0;
		 s2 = 0;
		 while (m != 0) {
		 s1 += m % 10;
		 m = m / 10;
		 }
		 m = i % 1000;
		 while (m != 0) {
		 s2 = s2 + m % 10;
		 m = m / 10;
		 }
		 if (s1 == s2) {
		 j++;
		 }
		 }
		 System.out.println(j);


		// int a = 9876 % 100;
		// int b = 987 % 10;
		// int c = 98 % 10;
		// int d = 98 / 10;
		// if (a + b == c + d) {
		// q++;
		//
		// }
		//
		// System.out.println(a + " " + b + " " + c + " " + d);

	}

}
