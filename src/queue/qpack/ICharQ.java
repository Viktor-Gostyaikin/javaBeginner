package queue.qpack;

public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch);

    // Извлечение символа из очереди
    char get();
}
