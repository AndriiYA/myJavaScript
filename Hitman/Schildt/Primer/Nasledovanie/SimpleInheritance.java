package ua.Kharkov.Hitman.Schildt.Primer.Nasledovanie;

public class SimpleInheritance {
	public static void main (String args[]){
		classA superOb = new classA();
		ClassB subOb = new ClassB();
		
		// Суперкласс может использоваться самостоятельно
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Содержимое superOb: ");
		superOb.showij();
		System.out.println();
		
		/*
		 * Подкласс имеет доступ ко всем открытым членам своего суперкласса.
		 */
		subOb.i = 7;
		subOb.j = 8;
		subOb.K = 9;
		System.out.println("Содержимое subOb: ");
		subOb.showij();
		subOb.showk();
		
		System.out.println();
		System.out.println("Сумма i, j и k в subOb: ");
		subOb.sum();
	}
}
