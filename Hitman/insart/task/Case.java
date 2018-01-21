package ua.Kharkov.Hitman.insart.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Case {

	private List<Product> a1 = new ArrayList<Product>();

	/**
	 * ����� add
	 * 
	 * @param newProduct
	 */
	public void add(Product newProduct) {
		a1.add(newProduct);
	}

	/**
	 * ����� count
	 * 
	 * @return size
	 */
	public int count() {
		return a1.size();
	}

	/**
	 * ����� ������� �� �������
	 * 
	 * @param index
	 * @return
	 */
	public Product get(int index) {
		return a1.get(index);
	}

	/**
	 * ����� ���������� �� ����
	 */
	public void sortByCost() {
		Collections.sort(a1);
	}

	/**
	 * ����� ������
	 */
	public void print() {
		for (Product a : a1)
			System.out.println(a);
	}

}
