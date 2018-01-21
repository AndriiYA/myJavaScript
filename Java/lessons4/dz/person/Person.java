package ua.Kharkov.Hitman.lessons4.dz.person;

import javax.swing.Spring;

@SuppressWarnings("unused")
public class Person {

	private String name;
	private int age;

	// get, set methods;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Конструктор по умолчанию (без параметров)
	public Person() {
		this.name = "Vasia";
		this.age = 15;
	}

	// Конструктор с параметрами
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Метод to string
	public String toString() {
		return name + "" + age + "";
	}

}
