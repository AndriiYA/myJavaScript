package ua.Kharkov.Hitman.Date;

import java.util.Date;

public class ConvertTest {

	public static void main(String[] args){

	Date a = new Date();
	String str = ConvertDate.convertToDate(a);
	System.out.println(str);
	
	Date b = new Date ();
	String str2 = ConvertDate.convertToTime(b);
	System.out.println(str2);
	
	Date p = new Date();
	String str3 = ConvertDate.convertToTimeAndDate(p);
	System.out.println(str3);

	String c = "23:30:34";
	System.out.println(ConvertDate.convertToTime(c));
	
	String q = "23.05.1789:06:30:34";
	System.out.println(ConvertDate.convertToTimeAndDate(q));
	
	String d = "23.05.1994";
	System.out.println(ConvertDate.convertToDate(d));

	
	

	}

}
