package ua.Kharkov.Hitman.Date;

public class ThrowDemo {

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("����������� ������ demoproc. ");
			throw e; // �������� �������� ����������
		}
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("��������� ��������: " + e);
		}
	}

}
