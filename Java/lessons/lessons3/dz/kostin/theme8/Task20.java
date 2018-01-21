package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

import ua.Kharkov.Hitman.lesson8.vektor.IncorrectIndexException;

public class Task20 {

	private int[] array;
	private int size;
	public final static int DEFAULT_LENGTH = 10;

	public Task20() {
		this(DEFAULT_LENGTH);
	}

	public Task20(int length) {
		this.array = new int[length];
	}

	public void add(int index, int number) {
		if (size == array.length) {
//			int mas[] = new int[array.length + 1];
//			for (int i = 0; i < array.length; i++) {
//				if (i < index) {
//					size = array[i];
//				} else {
//					array[i + 1] = array.length;
//				}
//			}
		}
		array[index] = number;
		size++;
	}

	public String toString() {
		String rezalt = "[";
		for (int i = 0; i < size; i++) {
			rezalt += array[i] + " ";
		}
		return rezalt + "]";
	}

	public void print() {
		System.out.println(Task20.this);
	}

}
