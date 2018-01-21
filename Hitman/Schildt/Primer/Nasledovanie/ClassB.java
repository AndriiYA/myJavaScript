package ua.Kharkov.Hitman.Schildt.Primer.Nasledovanie;

//Создание подкласса за счет расширения класса А.

class ClassB extends classA {
	int K;

	void showk() {
		System.out.println("k: " + K);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + K));
	}

}
