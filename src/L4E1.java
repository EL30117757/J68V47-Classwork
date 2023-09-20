import java.util.*;

public class L4E1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String  name = input.nextLine();

        System.out.println("Enter your surname:");
        String surname = input.nextLine();

        System.out.println("Enter the total value of your order:");
        float order = Float.parseFloat(input.nextLine());

        System.out.println("Enter the amount you wish to pay as deposit:");
        float deposit = Float.parseFloat(input.nextLine());

        float remainder = (order - deposit);


        System.out.println("== RECEIPT ==" + "\nCustomer:" + name.substring(0, 1) + surname + "\nOrder Total £" + order + "\nDeposit paid £" + deposit + "\nRemainder £" + remainder);
        // System.out.format("The cost is £%.2f",remainder); Shows to the two decimal places
        if (deposit >= 100)
            System.out.println("You get a free toaster!");

        System.out.println("Have a nice day");



    }
}
