package ua.Kharkov.Hitman.insart.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Case {

	private List<Product> a1 = new ArrayList<Product>();

	/**
	 * метод add
	 * 
	 * @param newProduct
	 */
	public void add(Product newProduct) {
		a1.add(newProduct);
	}

	/**
	 * метод count
	 * 
	 * @return size
	 */
	public int count() {
		return a1.size();
	}

	/**
	 * метод доступа по индексу
	 * 
	 * @param index
	 * @return
	 */
	public Product get(int index) {
		return a1.get(index);
	}

	/**
	 * метод сортировки по цене
	 */
	public void sortByCost() {
		Collections.sort(a1);
	}

	/**
	 * метод печать
	 */
	public void print() {
		for (Product a : a1)
			System.out.println(a);
	}

}
