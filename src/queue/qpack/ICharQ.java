package queue.qpack;

import queue.QueueEmptyException;
import queue.QueueFullException;

public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;

    // Извлечение символа из очереди
    char get() throws QueueEmptyException;
}
