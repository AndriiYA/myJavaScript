package ua.Kharkov.Hitman.lessons5.dz.kostin.theme9;

public class Task1 {

	/*
	 * 9.1. ������� ����������� �����, ������� ����� ����� ��� �������������
	 * ��������� a � b, � � �������� ������ �������� ���������� ��������� �����
	 * ����� �� ������� [a;b]. C ������� ������� ������ ��������� ������ �� 20
	 * ����� ����� � ������� ��� �� �����.
	 */

	// ����������� ����� (�������)
	public static int rand(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + (a));

	}

	/*
	 * 9.2. ������� �����, ������� ����� �������� ��������� ������ �� ����� �
	 * ������. � ������� ���������� ������ � ������ �� ���������� ������
	 * ��������� 5 �������� �� 10 ��������� ������ ���������� ������� � �������
	 * ��� 5 �������� �� �����, ������ �� ��������� ������.
	 */
	public static int rand2(int a, int b) {
		return (int) (Math.random() * (b - a + 1) + (a));
	}

	// ����� ���������
	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 9.3. ������� �����, ������� ����� ����������� ��������� ������ ��
	 * ����������� ����� ��������� ��� ��������.
	 */
	public static void bubble(int[] array) {
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
	}
	/*
	 * 9.4. � ������� �������� 7 ���� �������� ��������� �����. �������
	 * ���������, ������� ����������� � ������� �� ����� ������ � ����������
	 * �������. ��������, ���� ���� ���� ����� ������: ������, ���������,
	 * ��������, �������, �. �. �������, �. �. ������, �����������
	 */
	public static void sort(String [] array){
		for (int i=0; i<array.length-1; i++){
			for (int j=i+1; j<array.length; j++){
				if (array[i].compareTo(array[j])>0){
					String tmp = array[i];
					array[i]=array[j];
					array[j]=tmp;
				}
			}
		}
	}
}
