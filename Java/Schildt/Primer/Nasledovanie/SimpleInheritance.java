package ua.Kharkov.Hitman.Schildt.Primer.Nasledovanie;

public class SimpleInheritance {
	public static void main (String args[]){
		classA superOb = new classA();
		ClassB subOb = new ClassB();
		
		// ���������� ����� �������������� ��������������
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("���������� superOb: ");
		superOb.showij();
		System.out.println();
		
		/*
		 * �������� ����� ������ �� ���� �������� ������ ������ �����������.
		 */
		subOb.i = 7;
		subOb.j = 8;
		subOb.K = 9;
		System.out.println("���������� subOb: ");
		subOb.showij();
		subOb.showk();
		
		System.out.println();
		System.out.println("����� i, j � k � subOb: ");
		subOb.sum();
	}
}
