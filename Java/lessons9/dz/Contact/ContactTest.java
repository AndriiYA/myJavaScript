package ua.Kharkov.Hitman.lessons9.dz.Contact;

import java.util.Date;

import ua.Kharkov.Hitman.Date.ConvertDate;

public class ContactTest {
	public static void main(String[] args) {
		Date a = new Date();
		ConvertDate.convertToDate(a);
		Contact [] ob = new Contact [10];
		for (Contact c:ob){
			c.print();
			
		}
		
	}

	}


