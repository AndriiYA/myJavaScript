package ua.Kharkov.Hitman.insart.task;

public class SparlingWater extends Product {

	private boolean isNew;
	static private int count = 0;
	static private double commonCost = 0;

	/**
	 * 
	 * @param isNew
	 *            to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	/**
	 * 
	 * @return isNew
	 */
	public boolean getNew() {
		return isNew;
	}

	/**
	 * конструктор без параметров
	 */
	public SparlingWater() {
		this.setCost(10);
		this.setName("Evian");
		this.setNew(true);
		count++;
		commonCost += 10;
	}

	/**
	 * конструктор с параметрами
	 * 
	 * @param cost
	 * @param name
	 * @param isNew
	 */
	public SparlingWater(double cost, String name, boolean isNew) {
		this.setCost(cost);
		this.setName(name);
		this.setNew(isNew);
		count++;
		commonCost += cost;
	}

	public String toString() {
		return " " + getCost() + " " + getName() + " " + isNew;
	}

	/**
	 * средняя стоимость
	 */
	static public void avgCost() {
		System.out.println(commonCost / count);
	}

}
