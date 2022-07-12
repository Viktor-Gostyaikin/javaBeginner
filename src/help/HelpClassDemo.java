package help;

class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        Help helpObj = new Help();

        for (; ; ) {
            do {
                helpObj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpObj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            helpObj.helpOn(choice);
        }
    }
}