package threads;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        var myThread = MyThread.createAndStart("Порожденный поток №1");

        myThread.start();

        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exception) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}
