package ua.Kharkov.Hitman.lessons19.dz.contactList;

import java.util.Date;

import ua.Kharkov.Hitman.Date.ConvertDate;
import ua.Kharkov.Hitman.lessons9.dz.Contact.Contact;

public class ContactListTest {

	public static void main(String[] args) {

		ContactList list = new ContactList();
		list.add(new Contact(ConvertDate.convertToDate("30.02.1999"),"A","345-231-41"));
		list.add(new Contact(ConvertDate.convertToDate("30.02.1999"),"B","345-231-41"));
		list.add(new Contact(ConvertDate.convertToDate("30.02.1999"),"C","345-231-41"));
		list.add(new Contact(ConvertDate.convertToDate("30.02.1999"),"D","345-231-41"));
		list.add(new Contact(ConvertDate.convertToDate("30.02.1999"),"F","345-231-41"));
		list.print();
		list.search("A");

	}
}
