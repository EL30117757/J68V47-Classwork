import java.util.Scanner;

public class L3E1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your first name");
            String name = input.nextLine();

            System.out.println("Enter your surname");
            String surname = input.nextLine();

            System.out.println("Enter your date of birth");
            String birth = input.nextLine();

            System.out.println("Username:" + name.substring(0, 1) + surname.toLowerCase() + "\nPassword:" +
                    surname.substring(0, 1).toLowerCase() + name.substring(0, 3).toUpperCase() + birth);
        }
    }
