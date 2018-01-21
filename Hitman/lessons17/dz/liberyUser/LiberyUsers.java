package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.util.Date;

public class LiberyUsers {
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
	private String roomLibrariCard;
	private String faculty;
	private Date dateOfBirth;
	private String phoneNumber;

	// ���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ����� ������������� ������
	public String getRoomLibrariCard() {
		return roomLibrariCard;
	}

	public void setRoomLibrariCard(String roomLibrariCard) {
		this.roomLibrariCard = roomLibrariCard;
	}

	// ���������
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	// ���� ��������
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
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
	public LiberyUsers() {
		this.name = "";
		this.dateOfBirth = new java.util.Date();
		this.faculty = "";
		this.roomLibrariCard = "";
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
	public LiberyUsers(String name, String roomLibrariCard, String faculty,
			Date dateOfBirth, String phoneNumber) {
		this.name = name;
		this.roomLibrariCard = roomLibrariCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * ����� toString
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
