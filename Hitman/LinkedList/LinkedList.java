package ua.Kharkov.Hitman.LinkedList;

public class LinkedList {

	/*
	 * ����� "����������� ������" �������� �����, ������� ��������� �����������
	 * ����������� ������ ����� � ��������� ������. ������ �������������� �����
	 * �����������: ���������� �� ������ � ��������� ������ (���� info) �
	 * ���������� �� ������ ��, ������ ����� �������� (���� tail). � �������
	 * ������ ��������������� ������ ���� ��������� ����� null. ������: ��������
	 * ������, �������� ������� � �����, �������� ������� � i-� �������, �������
	 * i-� �������, ������� �� �����. ���������� ������������ ��������
	 * ���������� ����� ����������� ���� �������.
	 */

	private Item tail;

	/**
	 * 
	 */
	public LinkedList() {
		this.tail = null;
	}

	/**
	 * @param tail
	 */
	public LinkedList(Item tail) {
		this.tail = tail;
	}

	/**
	 * ����� ���������� ������ � ����� ������
	 * 
	 * @param info
	 *            - ����� ������
	 */
	public void add(String info) {
		if (tail != null) {
			Item temp = tail;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			// Item newItem = new Item(info, null);
			temp.setNext(new Item(info, null));
		} else {
			tail = new Item(info, null);
		}
	}

	/**
	 * ����� ���������� ������ �� �������
	 * 
	 * @param info
	 *            - ������
	 * @param position
	 *            - ���� �������� ������ � ������
	 */
	public void addPosition(String info, int position) {
		Item newItem = new Item(info, null);
		if (tail == null) {
			tail = new Item(info, null);
		} else {
			Item iterableItem = tail;
			while (position - 1 > 0) {
				iterableItem = iterableItem.getNext();
				position--;
			}
			newItem.setNext(iterableItem.getNext());
			iterableItem.setNext(newItem);
		}
	}

//	public void remove(int position) {
//		Item iterableItem = tail;
//		Item newItem = null;
////		while (position -1 >= 0) {
////			iterableItem = iterableItem.getNext();
////			position--;
////		}
////		tail.setNext(iterableItem.getNext());
////		iterableItem.setNext(tail);
//		while (position -1 <0){
//			position++;
//			iterableItem = iterableItem.getNext();
//		}
//	}
	
	/**
	 * 
	 * @param index
	 */
	public void remove (int index){
		if (index==0){
			tail=tail.getNext();
		}else{
			Item current = tail;
		for (int i =0; i<index-1; i++){
			current = current.getNext();
		}
		current.next = current.next.next;
		}
	}

	/**
	 * 
	 */
	public void clean() {
		while (tail != null) {
			tail = tail.getNext();
		}
	}

	/**
	 * 
	 */
	public String toString() {
		Item tmp = tail;
		if (tmp.getNext() != null) {
			tmp = tail.getNext();
			return tail.getInfo() + tmp;
		} else {
			return tmp.getInfo() + " " + tmp.getNext();
		}
	}

	/**
	 * 
	 */
	public void print() {
		System.out.println(this);
	}

}
