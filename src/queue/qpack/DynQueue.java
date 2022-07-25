package queue.qpack;

// Динамическая очередь
public class DynQueue implements ICharQ {
    private char[] q;   // Массив для хранения элементов очереди
    private int putLoc, getLoc;    // индексы вставляемых и

    // извлекаемых элементов
    // Создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putLoc = getLoc = 0;
    }

    // Помещение симвла в очередь
    public void put(char ch) {
        if (putLoc == q.length) {
            // Увеличение размера очереди
            char[] t = new char[q.length * 2];
            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putLoc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getLoc++];
    }
}
