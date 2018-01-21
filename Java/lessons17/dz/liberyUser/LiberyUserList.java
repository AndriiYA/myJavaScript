package ua.Kharkov.Hitman.lessons17.dz.liberyUser;

import java.util.ArrayList;
import java.util.List;

public class LiberyUserList {

	protected List<LiberyUser> list;

	public LiberyUserList() {
		list = new ArrayList<LiberyUser>();
	}

	public void add(LiberyUser name) {
		list.add(name);
	}

	public void remove(LiberyUser name) {
		list.remove(name);
	}

	public void remove(int index) {
		list.remove(index);
	}

	public String toString() {
		return list.toString();
	}

}
