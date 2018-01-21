package ua.Kharkov.Hitman.lessons.lessons3.dz.kostin.theme8;

import ua.Kharkov.Hitman.lesson8.vektor.IncorrectIndexException;

public class Task16 {

	public static void main(String[] args) {
//		public void add(int index, int number) {
//			if (size == array.length) {
//				int mas[] = new int[array.length + 1];
//				for (int i = 0; i < array.length; i++) {
//					if (i < index) {
//						mas[i] = array[i];
//					} else {
//						mas[i + 1] = array[i];
//					}
//				}
//				array = mas;
//			}
//			array[index] = number;
//			size++;
//		}
		
		int [] array = {2,3,4,5,6,7,8};
		array[array.length] = array[array.length +1] ;
		//for(int i=0; i<array.length; i++){
			System.out.println( array.length);
		//}
		

	
		
		

	}

}
