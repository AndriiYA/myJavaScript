package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.util.Date;

public class LiberyUsers {
	/*
	 * 3. Определить класс, хранящий такую информацию о пользователе библиотеки:
	 * ФИО, номер читательского билета, факультет, дата рождения, телефон.
	 * Доступ к данным класса организовать посредством соответствующих
	 * функций-членов. Разработать программу, в которой создается массив
	 * объектов данного класса. В программе организовать: – ввод данных о
	 * читателях; – вывод данных массива на экран; – поиск (по фамилии или
	 * факультету) и вывод информации о читателях;
	 */

	private String name;
	private String roomLibrariCard;
	private String faculty;
	private Date dateOfBirth;
	private String phoneNumber;

	// ФИО
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// номер читательского билета
	public String getRoomLibrariCard() {
		return roomLibrariCard;
	}

	public void setRoomLibrariCard(String roomLibrariCard) {
		this.roomLibrariCard = roomLibrariCard;
	}

	// факультет
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	// дата рождения
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// телефон
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * конструктор по умолчанию, без параметров
	 */
	public LiberyUsers() {
		this.name = "";
		this.dateOfBirth = new java.util.Date();
		this.faculty = "";
		this.roomLibrariCard = "";
		this.phoneNumber = "";
	}

	/**
	 * конструктор с параметрами
	 * 
	 * @param name
	 * @param roomLibrariCard
	 * @param faculty
	 * @param dateOfBirth
	 * @param phoneNumber
	 */
	public LiberyUsers(String name, String roomLibrariCard, String faculty,
			Date dateOfBirth, String phoneNumber) {
		this.name = name;
		this.roomLibrariCard = roomLibrariCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * метод toString
	 */
	public String toString() {
		return "LiberyUsers [name=" + name + ", roomLibrariCard="
				+ roomLibrariCard + ", faculty=" + faculty + ", dateOfBirth="
				+ dateOfBirth + ", phoneNumber=" + phoneNumber + "]";
	}

	public void print() {
		System.out.println(this);

	}

}
