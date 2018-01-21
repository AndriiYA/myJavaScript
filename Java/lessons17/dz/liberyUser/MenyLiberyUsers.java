package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenyLiberyUsers {
	
	public class MenuFinal {
		private List<LiberyUsers> LiberyUsers;
		private Scanner input;

		public MenuFinal() {
			input = new Scanner(System.in);
			LiberyUsers = new ArrayList<LiberyUsers>();
		}
			public void start() {
				// TODO Auto-generated method stub
				String str = "";

			try {
				File file = new File("d:\\newfile.txt"); // куда сохранить новый
															// файл
				if (file.createNewFile()) {
					System.out.println("File is created!"); // файл создается
				} else {
					System.out.println("Hello java!!!");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			do {
				System.out.println();
				System.out.println("1. add");
				System.out.println("2. edit");
				System.out.println("0. exit");
				System.out.println("ведите цифру: ");
				str = input.nextLine();
				getInput(str); // Вызов метода getInput
			} while (!str.equals("0")); // Сравнение строки которая не должна
										// быть
										// равна нулю
		}

		private void getInput(String input) {
			switch (Integer.parseInt(input)) { // static int parseInt(String s)
												// -
												// Выполняет грамматический
												// разбор
												// аргумента строки как
												// десятичного
												// целого

			case 1:
				File file = new File("d:/newfile.txt");

				System.out.println("add:\nPlease enter name");
				String name = this.input.nextLine() + "\r\n";

				System.out.println("add:\nPlease enter roomLibrariCard");
				String roomLibrariCard = this.input.nextLine() + "\r\n";

				System.out.println("add:\nPlease enter faculty");
				String faculty = this.input.nextLine() + "\r\n";

				System.out
						.println("add:\nPlease enter birthday in format dd.MM.yyyy");
				String birthday = this.input.nextLine() + "\r\n";

				System.out.println("add:\nPlease enter phone");
				String phone = this.input.nextLine() + "\r\n";

				LiberyUsers a = new LiberyUsers();

				LiberyUsers.add(a);

				try (FileOutputStream fop = new FileOutputStream(file)) {

					if (!file.exists()) {
						file.createNewFile();
					}
					byte[] contentInBytes = name.getBytes();
					byte[] contentInBytes1 = roomLibrariCard.getBytes();
					byte[] contentInBytes2 = faculty.getBytes();
					byte[] contentInBytes3 = birthday.getBytes();
					byte[] contentInBytes4 = phone.getBytes();
					fop.write(contentInBytes);
					fop.write(contentInBytes1);
					fop.write(contentInBytes2);
					fop.write(contentInBytes3);
					fop.write(contentInBytes4);
					
					fop.flush();
					fop.close();
					System.out.println("Done");

				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 2:
				System.out.println(LiberyUsers.size());
				for (LiberyUsers i : LiberyUsers) {
					System.out.println(i);
				}
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



}
