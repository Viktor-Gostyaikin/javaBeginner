package queue;

public class Queue {
    char[] queue;   // Массив для хранения элементов очереди
    int putLocation, getLocation;   // индексы для вставки и извлечения
                                    // элементов очереди
    Queue(int size) {
        this.queue = new char[size];// выделение памяти для очереди
        putLocation = getLocation = 0;
    }
    // Помещение символа в очередь
    void put(char ch){
        if (putLocation == queue.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        queue[putLocation++] = ch;
    }
    // Извлечение сивола из очереди
    char get() {
        if (getLocation == putLocation) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return queue[getLocation++];
    }
}

