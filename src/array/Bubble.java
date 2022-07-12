package array;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {
                99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49
        };
        int a, b, t;
        int size;

        size = nums.length;

        // Отображение исходного массива
        System.out.print("Исходный массив:");
        for (int i=0; i < size; i++) {
            System.out.printf(" %d", nums[i]);
        }
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a=1; a < size; a++)
            /*  Если требуемый порядок следования не соблюдается,
                 поменять элемнты местами*/
            for (b = size - 1; b >= a; b--)
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
        // Отображение отсортированного массива
        System.out.print("Остсортированный массив:");
        for (int i=0; i < size; i++){
            System.out.printf(" %d", nums[i]);
        }
        System.out.println();
    }
}
