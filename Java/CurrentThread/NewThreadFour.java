package ua.Kharkov.Hitman.CurrentThread;

class NewThreadFour implements Runnable {

	String name; // ��� ������
	Thread t;

	NewThreadFour(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("����� �����: " + t);
		t.start(); // ������ �������
	}

	// ������� ����� ������
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " ������� ");
		}
		System.out.println(name + " �������� ");
	}
}


		

