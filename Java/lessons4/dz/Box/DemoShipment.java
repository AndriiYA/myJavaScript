package ua.Kharkov.Hitman.lessons4.dz.Box;

public class DemoShipment {
	public static void main(String args[]) {

		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
		double vol;
		vol = shipment1.volume(); // ���������� � ������� ������
		System.out.println("obiom Shipment1 raven " + vol);
		System.out.println("Ves Shipment1 raven " + shipment1.weight);
		System.out.println("��������� ��������: $ " + shipment1.cost);
		System.out.println();
		vol = shipment2.volume();
		System.out.println("����� shipmen2 ����� " + vol);
		System.out.println("��� shipment2 ����� " + shipment2.weight);
		System.out.println("��������� ���������: $ " + shipment2.cost);
	}

}
