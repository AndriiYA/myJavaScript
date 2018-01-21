package ua.Kharkov.Hitman.lessons19.dz.contactList;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bookShop.Book;
import ua.Kharkov.Hitman.Date.ConvertDate;
import ua.Kharkov.Hitman.lessons9.dz.Contact.Contact;

public class ContactList {

	protected List<Contact> list;
	private static final String SEPARATOR = "\r\n";

	public ContactList() {
		list = new ArrayList<Contact>();
	}

	/**
	 * метод добавления контакта add a contact method
	 * 
	 * @param contact
	 *            - new Contact
	 */
	public void add(Contact contact) {
		list.add(contact);
	}

	/**
	 * метод редактирования контакта индекс которого задается method of editing
	 * a contact whose index is given by
	 * 
	 * @param index
	 *            - индекс контакта
	 * @param birthday
	 *            - день рождения
	 * @param name
	 *            - имя
	 * @param phoneNumber
	 *            - телефон
	 */
	public void edit(int index, String birthday, String name, String phoneNumber) {

		list.set(index, new Contact(ConvertDate.convertToDate(birthday), name,
				phoneNumber));
	}

	/**
	 * метод удаления контакта removal of contact
	 * 
	 * @param contact
	 */
	public void delete(Contact contact) {
		list.remove(contact);
	}
	
	/**
	 * метод удаления контакта по индексу removal of contact index
	 * 
	 * @param index
	 */
	public void delete(int index) {
		list.remove(index);
	}

	/**
	 * метод сохранения в файл method of saving a file
	 */
	public void save() {
		File file = new File("d:/newfile2.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			// String.valueOf(contactList.size() + SEPARATOR)
			writer.write(String.valueOf((list.size()
					+ " - the number of contacts" + SEPARATOR)));
			for (Contact i : list) {
				writer.write(i.getName() + SEPARATOR);
				writer.write(i.getPhoneNumber() + SEPARATOR);
				writer.write(ConvertDate.convertToDate((i.getBirthday()))
						+ SEPARATOR);
			}
		} catch (Exception e) {
			return;
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * метод считывания содержимого файла method of reading the contents of the
	 * file
	 */
	@SuppressWarnings("deprecation")
	public void read() {
		File file = new File("d:/newfile2.txt"); // Считываем строку с файла
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * метод считывания содержимого файла method of reading the contents of the
	 * file
	 * 
	 * @param path
	 *            путь к файлу
	 * @return
	 */
	public boolean load(String path) {
		return load(new File(path));
	}

	/**
	 * метод считывания содержимого файла method of reading the contents of the
	 * file
	 * 
	 * @param file
	 * @return
	 */
	public boolean load(File file) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String count = reader.readLine();
			for (int i = 0; i < Integer.valueOf(count); i++) {
				String birthday = reader.readLine();
				String name = reader.readLine();
				String phoneNumber = reader.readLine();
				list.add(new Contact(ConvertDate.convertToDate(birthday), name,
						phoneNumber));
			}
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * метод сортировки контактов по имени method of sorting contacts by name
	 */
	public void sortByName() {
		ContactComparator c = new ContactComparator();
		Collections.sort(list, c);
	}

	private class ContactComparator implements Comparator<Contact> {
		public int compare(Contact o1, Contact o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	/**
	 * метод поиска контакта по имени
	 * method of finding a contact by name
	 * @param name
	 */
	public void search(String name) {
		for (Contact i : list) {
			if (i.getName().contains(name)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * метод возврощает строковое представление объекта method of finding a
	 * contact by name
	 */
	public String toString() {
		return list.toString();
	}

	/**
	 * метод вывода на экран method of display
	 */
	public void print() {
		System.out.println(ContactList.this);

	}

}
