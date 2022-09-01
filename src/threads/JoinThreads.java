package threads;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        var myThread1 = MyThread.createAndStart("Порожденный поток №1");
        var myThread2 = MyThread.createAndStart("Порожденный поток №2");
        var myThread3 = MyThread.createAndStart("Порожденный поток №3");
        var myThread4 = MyThread.createAndStart("Порожденный поток №4");

        try {
            myThread1.join();
            System.out.println("Порожденный поток #1 - присоединен.");
            myThread2.join();
            System.out.println("Порожденный поток #2 - присоединен.");
            myThread3.join();
            System.out.println("Порожденный поток #3 - присоединен.");
            myThread1.join();
            System.out.println("Порожденный поток #1 - присоединен.");

        } catch (InterruptedException exception) {
            System.out.println("Прерывание основного потока.");
        }
    System.out.println("Завершение основного потока.");
    }
}
