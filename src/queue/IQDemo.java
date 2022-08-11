package queue;

import queue.qpack.ICharQ;
import queue.qpack.CircularQueue ;
import queue.qpack.DynQueue;
import queue.qpack.FixedQueue;


public class IQDemo {
    public static void main(String[] args) {
        ICharQ iQ;
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        char ch;
        int i;

        // Помещение ряда символов в очередь фиксированного размера
        iQ = q1;
        for (i=0; i < 10; i++) {
            try {
                iQ.put((char) ('A'+i));
            } catch (QueueFullException exeption) {
                System.out.println(exeption);
            }
        System.out.println();
        }

        // Отображение содержимого очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i=0; i<10; i++) {
            try {
                ch = iQ.get();
                System.out.print(ch);
            } catch (QueueEmptyException exeption) {
                System.out.println(exeption);
            }
        }
        System.out.println();

        // Помещение ряда символов в динамическую очередь
        iQ = q2;
        for (i=0; i<10; i++) {
            try {
                iQ.put((char) ('Z'-i));
            } catch (QueueFullException exeption) {
                System.out.println(exeption);
            }
        }
        // Отображение содержисого очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i=0; i<10; i++) {
            try {
                ch = iQ.get();
                System.out.print(ch);
            } catch (QueueEmptyException exeption) {
                System.out.println(exeption);
            }
        }
        System.out.println();

        // Помещение ряда символов в кольцевую очередь
        iQ = q3;
        for (i=0; i<10; i++) {
            try {
                iQ.put((char) ('A' + i));
            } catch (QueueFullException exeption) {
                System.out.println(exeption);
            }
        }
        // Отображение содержимого очерди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i=0; i<10; i++) {
            try {
                ch = iQ.get();
                System.out.print(ch);
            } catch (QueueEmptyException exeption) {
                System.out.println(exeption);
            }
        }
        System.out.println();
        // Помещение дополнительных символов в кольцевую очередь
        for (i=10; i<20; i++) {
            try {
                iQ.put((char) ('A' + i));
            } catch (QueueFullException exeption) {
                System.out.println(exeption);
            }
        }
        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i=0; i < 10; i++) {
            try {
                ch = iQ.get();
                System.out.print(ch);
            } catch (QueueEmptyException exeption) {
                System.out.println(exeption);
            }
        }
        System.out.println("\nСохранение и использование данных "
                            + "кольцевой очереди.");
        // Помещение символов в кольцевую очередь с последующим их извлечением
        for (i=0; i<20; i++) {
            try {
                iQ.put((char) ('A'+i));
            } catch (QueueFullException exeption) {
                System.out.println(exeption);
            }
            try {
                ch = iQ.get();
                System.out.print(ch);
            } catch (QueueEmptyException exeption) {
                System.out.println(exeption);
            }
        }
        System.out.println();
    }
}
