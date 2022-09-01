package threads;

public class UseThreads {
    public static void main(String[] args) {
        System.out.print("Запуск основного потока");
        // Сначала создать объект типа MyTread
        var myThread = new MyThread__("Порожденный поток №1");

        // Затем сформировать поток на основе этого объекта
        var newTread = new Thread(myThread);

        // Наконец, начать выполнение потока
        newTread.start();

        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
    }
}
