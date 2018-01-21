package ua.Kharkov.Hitman.lessons4.dz.Box;

public class BoxWeight extends Box {

	double weight; // VES PARALELIPIPEDA

	// Konstryirovanie klona obiekta

	BoxWeight(BoxWeight ob) { // peredacha obiekta konstryktory (вес коробки)
		super(ob); // ссылка на предка
		weight = ob.weight;
	}

	// konstryktor, ispolzyemiy pri ykazanii vseh parametrov
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // vizov konstryktora syperklassa
		weight = m;
	}

	// konstryktor, ispolzyemiy po ymolchaniy
	BoxWeight() {
		super();
		weight = -1;
	}

	// konstryktor, ispolzyemiy pri sozdanii kyba
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}
