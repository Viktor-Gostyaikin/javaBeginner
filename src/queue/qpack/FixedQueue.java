package queue.qpack;

import queue.QueueEmptyException;
import queue.QueueFullException;

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
    public void put(char ch) throws QueueFullException {
        if (putLoc == queue.length)
            throw new QueueFullException(queue.length);

        queue[putLoc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() throws QueueEmptyException {
        if (getLoc == putLoc)
            throw new QueueEmptyException();

        return queue[getLoc++];
    }
}
