package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.util.Scanner;
public class LiberyUserTest {

	public static void main(String[] args) {

		LiberyUser[] liberyUser = new LiberyUser[3];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < liberyUser.length; i++) {
			LiberyUser c = new LiberyUser();

			String name = scanner.nextLine();
			c.setName(name);

			String roomLiberyCard = scanner.nextLine();
			c.setRoomLiberyCard(roomLiberyCard);

			String faculty = scanner.nextLine();
			c.setFaculty(faculty);

			String dateOfBirth = scanner.nextLine();
			c.setDateOfBirth(dateOfBirth);

			String phoneNumber = scanner.nextLine();
			c.setPhoneNumber(phoneNumber);
			liberyUser[i] = c;
		}

		for (LiberyUser c : liberyUser) {
			System.out.println(c);
		}
		// TODO println: enter search string
		String search = scanner.nextLine();

		for (LiberyUser c : liberyUser) {
			if (c.getName().contains(search)) {
				System.out.println(c);
			}
		}

	}

}
