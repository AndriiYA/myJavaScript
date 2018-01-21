package ua.Kharkov.Hitman.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	private final static String UA_FORMAT = "dd.MM.yyyy";
	private final static String TIME_FORMAT = "HH:mm:ss";
	private final static String TIME_DATE_FORMAT = "dd.MM.yyyy:HH:mm:ss";

	/**
	 * метод конвертирования даты из строки, в Date формат
	 * 
	 * @param date
	 * @return
	 */
	public static Date convertToDate(String date) {
		return ConvertDate.convert(date, UA_FORMAT);
	}

	/**
	 * метод конвертирования времени из строки в Date
	 * @param time
	 * @return
	 */
	public static Date convertToTime(String time) {
		return ConvertDate.convert(time, TIME_FORMAT);
	}

	/**
	 * метод конвертирования (даты и времени), из строки в Date
	 * @param Daytime
	 * @return
	 */
	public static Date convertToTimeAndDate(String Daytime) {
		return ConvertDate.convert(Daytime, TIME_DATE_FORMAT);
	}

	/**
	 * метод конвертирования Date формат в строку 
	 * @param toDay
	 * @return Date в UA_FORMAT  
	 */
	public static String convertToDate(Date toDay) {
		return ConvertDate.convert(toDay, UA_FORMAT);
	}
	
	/**
	 * метод конвертирования Date формат в строку
	 * @param toDay
	 * @return Date в TIME_FORMAT
	 */
	public static String convertToTime(Date toDay) {
		return ConvertDate.convert(toDay, TIME_FORMAT);
	}
	
	/**
	 * метод конвертирования Date формат в строку 
	 * @param toDay
	 * @return Date в TIME_DATE_FORMAT 
	 */
	public static String convertToTimeAndDate(Date toDay) {
		return ConvertDate.convert(toDay, TIME_DATE_FORMAT);
	}

	/**
	 * метод конвертирования Date в строку
	 * 
	 * @param toDay
	 *            - дата сегодня
	 * @param format
	 * @return Date строкой
	 */
	private static String convert(Date toDay, String format) {
		try {
			SimpleDateFormat formater = new SimpleDateFormat(format);
			String date = formater.format(toDay);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * метод конвертирования из строки в Date
	 * 
	 * @param Daytime
	 *            строка
	 * @param format
	 *            формат
	 * @return
	 */
	private static Date convert(String Daytime, String format) {
		try {
			SimpleDateFormat formater = new SimpleDateFormat(format);
			Date date = formater.parse(Daytime);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
}
