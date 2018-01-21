package ua.Kharkov.Hitman.lessons4.dz.person;

public class PersonTest {
	public static void main(String[] args) {
		Person a = new Person();

		Person a2 = new Person("Petia", 35);
		System.out.println(a2.getName());

		a2.setAge(35);
		System.out.println(a2.getAge());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a2.getName() + " " + a2.getAge() + " " + a.getName()
				+ " " + a.getAge());

	}
}
