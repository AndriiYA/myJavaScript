package ua.Kharkov.Hitman.lessons4.dz.Box;

public class Shipment extends BoxWeight {
	double cost;

	// konstryirovanie klona obiekta "отгрузка"
	Shipment(Shipment ob) { // peredacha obiekta konstryktory
		super(ob);
		cost = ob.cost;
	}

	// konstryktor, ispolzyemiy pri ykazanii vseh parametrov
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m);// vizov konstryktora syperklassa
		cost = c;
	}

	// konstryktor, ispolzyetca po ymolchaniy
	Shipment() {
		super();
		cost = -1;
	}

	// konstryktor ispolzyemiy pri sozdanii kyba
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}

}
