package ua.Kharkov.Hitman.lessons4.Etlec1;

public class Task9 {

	public static void main(String[] args) {
		
		int x = 0;
		int[][][][][][] array = new int[2][2][2][2][2][2];

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				for (int a = 0; a < array[j].length; a++)
					for (int b = 0; b < array[a].length; b++)
						for (int c = 0; c < array[b].length; c++)
							for (int d = 0; d < array[c].length; d++)
								array[i][j][a][b][c][d] = x++;
		System.out.println("количество чисел в массиве - " + x);

	}

}
