package array.quickSort;

class QSDemo {
    public static void main(String[] args) {
        char[] array = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;
        System.out.print("Исходный массив: ");
        for (i = 0; i < array.length; i++)
            System.out.print(array[i]);
        System.out.println();
        // Сортировка массива
        QuickSort.qsort(array);
        System.out.print("Отсортированный массив: ");
        for (i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }
}

