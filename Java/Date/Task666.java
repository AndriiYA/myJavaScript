package ua.Kharkov.Hitman.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task666 {

	
	public static String convert(Date toDay) {
		try {
			SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");
			String date = formater.format(toDay);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
