package ua.Kharkov.Hitman.lessons9.dz.Contact;

import java.util.*;

public class Contact {

	/**
	 * name - name Contact
	 */
	private String name;

	/**
	 * phoneNumber - phoneNumber Contact
	 */
	private String phoneNumber;

	/**
	 * birthday - birthday Contact
	 */
	private Date birthday;

	/**
	 * method returns the value name/Contact
	 * 
	 * @return name Contact
	 */
	public String getName() {
		return name;
	}

	/**
	 * method sets the value field of the class name/Contact
	 * 
	 * @param name
	 *            Contact
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method returns the value phoneNumber/Contact
	 * 
	 * @return PhoneNumber Contact
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * method sets the value field of the class phoneNumber/Contact
	 * 
	 * @param phoneNumber
	 *            Contact
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * method returns the value birthday/Contact
	 * 
	 * @return birthday Contact
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * method sets the value field of the class birthday/Contact
	 * 
	 * @param birthday
	 *            Contact
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	// Constructor without parameters
	public Contact() {
		this(new java.util.Date(), "", "");
	}

	// Constructor with parameters
	public Contact(Date birthday, String name, String phoneNumber) {
		this.birthday = birthday;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "День рождения - " + this.birthday + "; " + " Имя - "
				+ this.name + "; Номер телефона - " + this.phoneNumber +";"+"\n";
	}

	/**
	 * Method to output a string to the screen
	 */
	public void print() {
		System.out.println(this);
	}
}
