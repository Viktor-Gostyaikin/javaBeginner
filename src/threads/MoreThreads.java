package threads;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        var myThread1 = MyThread.createAndStart("Порожденный поток №1");
        var myThread2 = MyThread.createAndStart("Порожденный поток №2");
        var myThread3 = MyThread.createAndStart("Порожденный поток №3");
        var myThread4 = MyThread.createAndStart("Порожденный поток №4");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                System.out.println("Прерывание основного потока.");
            }
        } while (myThread1.isAlive()
                || myThread2.isAlive()
                || myThread3.isAlive()
                || myThread4.isAlive()
        );
        System.out.println("Завершение основного потока.");
    }
}
