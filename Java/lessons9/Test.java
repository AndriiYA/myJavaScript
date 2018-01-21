package ua.Kharkov.Hitman.lessons9;

public class Test {

	public static void main(String[] args) {

		// метод сортировки пузырьком
		int arr[] = { 1, 2, 3, 4, 6, 9, 7 };
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(temp);
				}
	//	for (int i = 0; i < arr.length; i++) {
	//		System.out.print(arr[i] + " ");
	//	}

	}
}