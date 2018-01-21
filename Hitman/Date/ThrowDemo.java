package ua.Kharkov.Hitman.Date;

public class ThrowDemo {

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Перехвачено внутри demoproc. ");
			throw e; // повторно передать исключение
		}
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Повторный перехват: " + e);
		}
	}

}
