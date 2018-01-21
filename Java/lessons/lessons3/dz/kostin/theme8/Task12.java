package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

public class Task12 {

	public static void main(String[] args) {

		String arr[][] = new String[5][5];
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {

				if (j % 2 == 0) {
					if (i % 2 == 0) {
						arr[i][j] = "×";
					} else {
						arr[i][j] = "Á";
					}

				} else {
					if (i % 2 == 0) {
						arr[i][j] = "Á";
					} else {
						arr[i][j] = "×";
					}
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
