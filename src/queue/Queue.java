package queue;

public class Queue {
    private final char[] queue;   // Массив для хранения элементов очереди
    private int putLocation, getLocation;   // индексы для вставки и извлечения
                                    // элементов очереди
    Queue(int size) {
        this.queue = new char[size + 1];// выделение памяти для очереди
        putLocation = getLocation = 0;
    }
    Queue(Queue obj){
        this.putLocation = obj.putLocation;
        this.getLocation = obj.getLocation;
        this.queue = new char[obj.queue.length];
        // Копилирование элементов очереди
        for (int i=getLocation; i <= putLocation; i++)
            queue[i] = obj.queue[i];
    }
    Queue(char[] array){
        this.putLocation = 0;
        this.getLocation = 0;
        this.queue = new char[array.length+1];

        for (char item : array) put(item);
    }
    // Помещение символа в очередь
    void put(char ch){
        if (putLocation == queue.length-1) {
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

