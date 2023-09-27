import java.util.*;
public class L5E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random number");
        int number = Integer.parseInt(input.nextLine());

       // int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}
