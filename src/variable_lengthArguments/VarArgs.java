package variable_lengthArguments;
// Демонстрация использования метода
// с переменным числом аргументов
// наряду с обычными аргументами

class VarArgs {
    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(String msg, int ... vars) {
        System.out.println(msg + vars.length);
        //System.out.printf("Количество аргументов vars: %d\n", vars.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < vars.length; i++)
            System.out.printf("\targ[%d]: %d\n", i, vars[i]);

        System.out.println();
    }

    public  static void main(String[] args) {
        // Метод vaTest() может вызываться с
        // переменным числом аргументов
        vaTest("Один аргумент в массиве:", 10);
        vaTest("Три аргумента в массиве:", 1, 2, 3);
        vaTest("Отсустствуют аргументы в виде массива");
    }
}