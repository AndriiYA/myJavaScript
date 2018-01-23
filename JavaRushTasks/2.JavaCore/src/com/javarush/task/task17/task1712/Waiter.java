package com.javarush.task.task17.task1712;

public class Waiter extends Thread implements Runnable {
    public boolean continueWorking = true;
// Класс Waiter должен реализовывать интерфейс Runnable.
//7. Если нет готовых блюд в очереди, нить класса Waiter должна получать заказ от столика и добавлять его в очередь заказов.
//8. Если есть готовые блюда в очереди, нить класса Waiter должна брать блюдо из очереди и относить заказ для столика.
    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {       //относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll();
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
