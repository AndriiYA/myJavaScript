package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.util.Date;

import ua.Kharkov.Hitman.Date.ConvertDate;


public class LiberyUsersTest {
	public static void main(String[] args) {
		Date a = new Date();
		ConvertDate.convertToDate(a);
		LiberyUsers [] ob = new LiberyUsers [10];
		for (LiberyUsers c:ob){
			c.print();
		}
		
		
		
		

	}

}
