import java.util.*;
public class L6E2 {

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("1. Say hello\n2. Tell me the time\n3. Tell me a joke\n4. Quit");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            System.out.println("Option selected " + option);
            if (option == 1) {
                System.out.println("Hello");

            } else if (option == 2) {
                System.out.println("15.18");

            } else if (option == 3) {
                //
            }



        } while (option != 4);
    }





    }
