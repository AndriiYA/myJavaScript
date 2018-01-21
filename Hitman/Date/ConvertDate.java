package ua.Kharkov.Hitman.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	private final static String UA_FORMAT = "dd.MM.yyyy";
	private final static String TIME_FORMAT = "HH:mm:ss";
	private final static String TIME_DATE_FORMAT = "dd.MM.yyyy:HH:mm:ss";

	/**
	 * ����� ��������������� ���� �� ������, � Date ������
	 * 
	 * @param date
	 * @return
	 */
	public static Date convertToDate(String date) {
		return ConvertDate.convert(date, UA_FORMAT);
	}

	/**
	 * ����� ��������������� ������� �� ������ � Date
	 * @param time
	 * @return
	 */
	public static Date convertToTime(String time) {
		return ConvertDate.convert(time, TIME_FORMAT);
	}

	/**
	 * ����� ��������������� (���� � �������), �� ������ � Date
	 * @param Daytime
	 * @return
	 */
	public static Date convertToTimeAndDate(String Daytime) {
		return ConvertDate.convert(Daytime, TIME_DATE_FORMAT);
	}

	/**
	 * ����� ��������������� Date ������ � ������ 
	 * @param toDay
	 * @return Date � UA_FORMAT  
	 */
	public static String convertToDate(Date toDay) {
		return ConvertDate.convert(toDay, UA_FORMAT);
	}
	
	/**
	 * ����� ��������������� Date ������ � ������
	 * @param toDay
	 * @return Date � TIME_FORMAT
	 */
	public static String convertToTime(Date toDay) {
		return ConvertDate.convert(toDay, TIME_FORMAT);
	}
	
	/**
	 * ����� ��������������� Date ������ � ������ 
	 * @param toDay
	 * @return Date � TIME_DATE_FORMAT 
	 */
	public static String convertToTimeAndDate(Date toDay) {
		return ConvertDate.convert(toDay, TIME_DATE_FORMAT);
	}

	/**
	 * ����� ��������������� Date � ������
	 * 
	 * @param toDay
	 *            - ���� �������
	 * @param format
	 * @return Date �������
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
	 * ����� ��������������� �� ������ � Date
	 * 
	 * @param Daytime
	 *            ������
	 * @param format
	 *            ������
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
