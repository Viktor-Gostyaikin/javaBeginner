package array;
/* В этом классе реализуется "отказоустойчивый" массив
    предотвращающий ошибки времени выполнения */
public class FailSoftArray {
    private int[] a;
    private int errorVal;
    public int length;

    public FailSoftArray(int size, int errorVal) {
        a = new int[size];
        this.errorVal = errorVal;
        this.length = size;
    }
    // Возврат значения элемента массива с заданным индексом
    public int get(int index){
        if (indexOK(index)) return a[index];
        return  errorVal;
    }
    // Установка значения элемента с заданным индексом.
    public boolean put(int index, int val){
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
    private  boolean indexOK(int index) {
        return index >= 0 & index < length;
    }
}

// Демонстрация работиы с "отказоустойчивым" массивом
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i=0; i < (fs.length * 2); i++)
            fs.put(i, i*10);

        for (int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        // Обраотка ошибок
        System.out.println("\nОбработка ошибок с выводом отчета.");
        for (int i =0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.printf("Индекс %d вне допустипмого диапазона\n", i);
                break;
            }
        }
        for (int i=0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.printf("%d ", x);
            else {
                System.out.printf("\nИндекс %d вне допустимого диапазона\n", i);
                break;
            }

        }
    }
}
