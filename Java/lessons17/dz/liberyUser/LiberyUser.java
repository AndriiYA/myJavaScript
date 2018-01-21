package ua.Kharkov.Hitman.lessons17.dz.liberyUser;


public class LiberyUser {
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
	private String RoomLiberyCard;
	private String faculty;
	private String dateOfBirth;
	private String phoneNumber;

	// ФИО
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// номер читательского билета
	public String getRoomLiberyCard() {
		return RoomLiberyCard;
	}

	public void setRoomLiberyCard(String roomLiberyCard) {
		this.RoomLiberyCard = roomLiberyCard;
	}

	// факультет
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	// дата рождения
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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
	public LiberyUser() {
		this.name = "";
		this.dateOfBirth = "";
		this.faculty = "";
		this.RoomLiberyCard = "";
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
	public LiberyUser(String name, String roomLibrariCard, String faculty,
			String dateOfBirth, String phoneNumber) {
		this.name = name;
		this.RoomLiberyCard = roomLibrariCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * метод toString
	 */
	public String toString() {
		return "LiberyUsers [name= " + name + ", roomLibrariCard = "
				+ RoomLiberyCard + " faculty = " + faculty + " dateOfBirth = "
				+ dateOfBirth + " phoneNumber = " + phoneNumber + "]" + "\n";
	}

	public void print() {
		System.out.println(this);

	}

}
