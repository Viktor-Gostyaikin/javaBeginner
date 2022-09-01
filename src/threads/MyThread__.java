package threads;

public class MyThread__ implements Runnable {
    /*  Объекты класса MyThread могут
    выполняться в своих собственных
    потоках, поскольку класс MyThread
    реализует интерфейс Runnable    */

    Thread thread;
    MyThread__(String name) {
        this.thread = new Thread(this, name);
    }
    // Фабричный метод — это метод, который возвращает объект класса.
    // Создание и запуск потока с помощью фабричного метода
    public static MyThread__ createAndStart(String name) {
        MyThread__ myThread = new MyThread__(name);

        myThread.thread.start(); // Запуск потока
        return myThread;
    }
    // Точка входа в поток
    public void run() {
        System.out.println(thread.getName() + " - запуск");
        try {
            for (int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thread.getName() + " счетчик: " + count);
            }
        } catch (InterruptedException exe) {
            System.out.println(thread.getName() + " - прерван");
        }
        System.out.println(thread.getName() + " - завершение");
    }
}
