package queue.qpack;

// Класс, реализующий очередь фиксированного размера
// для хранения символов
public class FixedQueue implements ICharQ {
    private char[] queue; // Массив для хранения элементов очереди
    private int putLoc, getLoc; // Индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        queue = new char[size]; // Выделение памяти для очереди
        putLoc = getLoc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if (putLoc == queue.length) {
            System.out.println(" - Очередь заполнена");
        }
        queue[putLoc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return queue[getLoc++];
    }
}
