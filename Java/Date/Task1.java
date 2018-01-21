package ua.Kharkov.Hitman.Date;

public class Task1 {
	public static void main(String[] args){ 
	
	// Использование блоков try и catch
	
		@SuppressWarnings("unused")
		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("Это не будет выведено.");
		} catch (Exception e) { // Перехват щшибки деления на ноль
			System.out.println("Деление на нуль." + e);
			{
				System.out.println("После оператора cath.");
			}
		}
	}
}
