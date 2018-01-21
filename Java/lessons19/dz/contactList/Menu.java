package ua.Kharkov.Hitman.lessons19.dz.contactList;

import java.util.Scanner;

import ua.Kgarkov.Hitman.lessons12.menu.Task;
import ua.Kharkov.Hitman.Date.ConvertDate;
import ua.Kharkov.Hitman.lessons9.dz.Contact.Contact;

public class Menu {

	private Scanner input;
	ContactList list = new ContactList();

	public Menu() {
		input = new Scanner(System.in);
	}

	public void start() {
		String str = "";
		do {
			System.out.println();
			System.out.println("1. add");
			System.out.println("2. edit");
			System.out.println("3. remove");
			System.out.println("4. delete");
			System.out.println("5. save");
			System.out.println("6. read");
			System.out.println("7. load");
			System.out.println("8. sortByName");
			System.out.println("9. search");
			System.out.println("10. print");
			System.out.println("0. exit");
			System.out.println("Введите цифру: ");
			str = input.nextLine();
			getInput(str); // Вызов метода getInput
		} while (!str.equals("0")); // Сравнение строки которая не должна быть
									// равна нулю
	}

	private void getInput(String input) {

		switch (Integer.parseInt(input)) { // static int parseInt(String s) -
											// Выполняет грамматический разбор
											// аргумента строки как десятичного
											// целого

		case 1:
			System.out
					.println("add:\nPlease enter birthday in format dd.MM.yyyy");
			String birthday = this.input.nextLine();

			System.out.println("add:\nPlease enter name");
			String name = this.input.nextLine();

			System.out.print("add:\nPlease enter phone");
			String phone = this.input.nextLine();

			if (Task.isValid(birthday, "dd.MM.yyyy")) {
				Contact c = new Contact(ConvertDate.convertToDate(birthday),
						name, phone);
				list.add(c);
			} else
				System.out
						.println("Owibka!!! Kontact ne bil dobavlen probyite ewe!");

			// list.add(new Contact(ConvertDate.convertToDate(birthday), name,
			// phone));
			break;

		case 2:
			System.out
					.println("edit:\n Plese edit  name, phone, and birthday, "
							+ "Enter the number of the contact to edit");
			String numb = this.input.nextLine();

			System.out
					.println("add:\nPlease enter birthday in format dd.MM.yyyy");
			String birthday1 = this.input.nextLine() + "\r\n";

			System.out.println("add:\nPlease enter name");
			String name1 = this.input.nextLine() + "\r\n";

			System.out.println("add:\nPlease enter phone");
			String phone1 = this.input.nextLine() + "\r\n";

			list.edit(Integer.parseInt(numb), birthday1, name1, phone1);
			break;

		case 3:
			System.out
					.println("delete:\nPlease enter index of contact to delete");
			String index = this.input.nextLine();
			list.delete(Integer.parseInt(index));
			break;
			
		case 4:
			System.out.println("remove:\nPlese enter contact to remove");
			
			

		case 5:
			System.out.println("Save: \nSave contacts to file");
			list.save();
			break;

		case 6:
			System.out.println("read:\nRead contacts from a file");
			list.read();
			break;

		case 7:
			System.out.println("load:\nLoad contacts from a file");
			list.load("d:/newfile2.txt");
			break;

		case 8:
			System.out.println("sortByName:\nSort contacts by Name");
			list.sortByName();
			break;

		case 9:
			System.out.println("search:\nSearch for a contact by name");
			String name2 = this.input.nextLine() + "\r\n";
			list.search(name2);
			break;

		case 10:
			list.print();
			break;

		case 0:
			System.out.println("exit:\n");
			break;

		default:
			System.out.println("Нет цифры в меню!!!");
			break;
		}
	}
}
