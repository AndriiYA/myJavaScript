package ua.Kharkov.Hitman.insart.task;

public class Water extends Product {
	private String material;
	static private int count = 0;
	static private double commonCost = 0;

	/**
	 * 
	 * @param material
	 *            to set
	 */
	private void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * 
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * онструктор по умолчанию
	 */
	public Water() {
		this.setCost(15);
		this.setName("Chinotto");
		this.setMaterial("Orange");
		count++;
		commonCost += 15;
	}

	/**
	 * конструктор с параметрами
	 * 
	 * @param cost
	 * @param name
	 * @param material
	 */
	public Water(int cost, String name, String material) {
		this.setCost(cost);
		this.setName(name);
		this.setMaterial(material);
		count++;
		commonCost += cost;
	}

	public String toString() {
		return " " + getCost() + " " + getName() + " " + material;
	}

	/**
	 * средняя стоимость
	 */
	static public void avgCost() {
		System.out.println(commonCost / count);
	}
}
