package help;

class Help {
    void helpOn(int choice) {
        switch (choice) {
            case '1' -> {
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
            }
            case '2' -> {
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа;");
                System.out.println("\tпоследовательность инструкций");
                System.out.println("\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("Цикл for:\n");
                System.out.print("for (инициализация; условие; итерация)");
                System.out.println("\tинструкция;");
            }
            case '4' -> {
                System.out.println("Цикл while:\n");
                System.out.println("while (условие) инструкция;");
            }
            case '5' -> {
                System.out.println("Цикл do-while:\n ");
                System.out.println("do {");
                System.out.println("\tинструкция;");
                System.out.println("} while (условие);");
            }
            case '6' -> {
                System.out.println("Инструкция break:\n");
                System.out.println("break; или break метка;");
            }
            case '7' -> {
                System.out.println("Инструкция continue:\n");
                System.out.println("continue; или continue метка;");
            }
        }
        System.out.println();
    }
    void showMenu() {
        System.out.println("Справка:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue\n");
        System.out.print("Выберите (q - выход): ");
    }
    boolean isValid(int choice) {
        return !(choice < '1' | choice > '7' & choice != 'q');
    }
}
