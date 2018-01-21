package ua.Kharkov.Hitman.LinkedList;

public class Item {

	/**
	 * указателем на строку в свободной памяти
	 */
	private String info;
	protected Item next;

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info
	 *            the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return the next
	 */
	public Item getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Item next) {
		this.next = next;
	}

	/**
	 * 
	 */
	public Item() {
		this.info = "";
		this.next = null;
	}

	/**
	 * @param info
	 * @param next
	 */
	public Item(String info, Item next) {
		this.info = info;
		this.next = next;
	}

	/**
	 * 
	 */
	public String toString() {
		return "[info=" + info + ", next=" + next + "]";
	}
	

}
