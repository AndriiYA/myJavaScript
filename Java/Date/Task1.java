package ua.Kharkov.Hitman.Date;

public class Task1 {
	public static void main(String[] args){ 
	
	// ������������� ������ try � catch
	
		@SuppressWarnings("unused")
		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("��� �� ����� ��������.");
		} catch (Exception e) { // �������� ������ ������� �� ����
			System.out.println("������� �� ����." + e);
			{
				System.out.println("����� ��������� cath.");
			}
		}
	}
}
