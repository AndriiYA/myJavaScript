package ua.Kharkov.Hitman.lessons17.dz.liberyUser;


public class LiberyUser {
	/*
	 * 3. ���������� �����, �������� ����� ���������� � ������������ ����������:
	 * ���, ����� ������������� ������, ���������, ���� ��������, �������.
	 * ������ � ������ ������ ������������ ����������� ���������������
	 * �������-������. ����������� ���������, � ������� ��������� ������
	 * �������� ������� ������. � ��������� ������������: � ���� ������ �
	 * ���������; � ����� ������ ������� �� �����; � ����� (�� ������� ���
	 * ����������) � ����� ���������� � ���������;
	 */

	private String name;
	private String RoomLiberyCard;
	private String faculty;
	private String dateOfBirth;
	private String phoneNumber;

	// ���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ����� ������������� ������
	public String getRoomLiberyCard() {
		return RoomLiberyCard;
	}

	public void setRoomLiberyCard(String roomLiberyCard) {
		this.RoomLiberyCard = roomLiberyCard;
	}

	// ���������
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	// ���� ��������
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// �������
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * ����������� �� ���������, ��� ����������
	 */
	public LiberyUser() {
		this.name = "";
		this.dateOfBirth = "";
		this.faculty = "";
		this.RoomLiberyCard = "";
		this.phoneNumber = "";
	}

	/**
	 * ����������� � �����������
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
	 * ����� toString
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
