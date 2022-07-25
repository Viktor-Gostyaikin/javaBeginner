package queue.qpack;

// Кольцевая очередь
public class CircularQueue implements ICharQ {
    private char[] queue; // Массив для хранения элементов очереди
    private int putLoc, getLoc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue(int size) {
        queue = new char[size + 1]; // Выделение памяти для очереди
        putLoc = getLoc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        // Очередь считается полной, если индекс putLoc на единицу
        // меньше индекса getLoc или если индекс putLoc указывает
        // на конец массив, а индекс getLoc - на его начало
        if ((putLoc + 1 == getLoc) |
                ((putLoc == queue.length - 1) & (getLoc == 0))) {
            System.out.println(" - Очередь заполнена");
        }
        queue[putLoc++] = ch;
        if (putLoc == queue.length) putLoc = 0; // Перейти в начало массива
    }

    // Извлечение символа из очереди
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
//        char ch = queue[getLoc++];
        if (getLoc == queue.length) getLoc = 0; // Вернуться в начало очереди

        return queue[getLoc++];
    }
}
