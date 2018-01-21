package ua.Kharkov.Hitman.lessons.lessons5.abstractclassHorse;

public abstract class SphericalHorse {

	// абстрактный метод ржать()
	abstract void neigh();

	// абстрактный класс может содержать и обычный метод
	void gallop() {
		System.out.println("Куда прёшь?");
	}
}
