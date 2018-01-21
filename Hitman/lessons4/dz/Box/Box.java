package ua.Kharkov.Hitman.lessons4.dz.Box;

public class Box {
	private double width;
	private double height;
	private double depth;

	// конструирование клона объекта
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Конструктор, используемый при указании всех измерений
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// конструктор, используемый, когда ни одно из измерений не указано
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Конструктор используемый при создании куба
	Box(double len) {
		width = height = depth = len;
	}

	// Вычиссление и возврат объема
	double volume() {
		return width * height * depth;
	}

}
