package ua.Kharkov.Hitman.lessons18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ua.Kharkov.Hitman.lessons4.dz.Car.Audi;
import ua.Kharkov.Hitman.lessons4.dz.Car.Car;

public class AudiList {
	private static final String SEPARATOR = "\n";
	protected List<Audi> list;

	public AudiList() {
		list = new ArrayList<Audi>();
	}

	public void add(Audi audi) {
		list.add(audi);
	}

	public void remove(Audi audi) {
		list.remove(audi);
	}

	public void remove(int index) {
		list.remove(index);
	}

	public void edit(int index, String mark, String color, int V) {

		list.set(index, new Audi());
	}

	public boolean save(String filename) {
		return save(new File(filename));
	}

	public boolean save(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(String.valueOf(list.size() + SEPARATOR));
			for (Car i : list) {
				writer.write(i.getColor());
				writer.write(SEPARATOR);
				writer.write(i.getMark());
				writer.write(SEPARATOR);
				writer.write(i.getV());
				writer.write(SEPARATOR);
			}
			return true;
		} catch (Exception e) {
			return false;
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
}
