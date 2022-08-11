package queue;

// Исключение для ошибок, связанных с заполненной очередью
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер " + size;
    }
}
