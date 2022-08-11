package queue;

// Исключение для ошибок, связаннвх с пустой очередью
public class QueueEmptyException extends Exception{
    public String toString() {
        return "\nОчередь пуста.";
    }
}
