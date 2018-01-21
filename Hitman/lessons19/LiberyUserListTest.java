package ua.Kharkov.Hitman.lessons19;

import ua.Kharkov.Hitman.lessons17.dz.liberyUser.LiberyUser;
import ua.Kharkov.Hitman.lessons17.dz.liberyUser.LiberyUserList;

public class LiberyUserListTest {

	public static void main(String[] args) {
		LiberyUserList list = new LiberyUserList();
		list.add(new LiberyUser("Vasra", "234", "KN", "12.12.12", "213123"));
		list.add(new LiberyUser("Vasra", "234", "KN", "11.11.11", "213123"));
		list.add(new LiberyUser("Vwsdf", "234", "KN", "10.10.10", "213123"));
		System.out.println(list);
	}
}
