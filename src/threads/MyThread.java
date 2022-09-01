package threads;

public class MyThread extends Thread {
    // Конструктор нового потока
    MyThread(String name) {
        super(name); // Имя потока
    }
    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);

        myThread.start();
        return  myThread;
    }
    public void run() {
        System.out.println(getName() + " - запуск.");
        try {
            for (int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exception) {
            System.out.println(getName() + " - прерван.");
        }
        System.out.println(getName() + " - завершение.");
    }

}
