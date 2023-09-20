
import java.util.*;

public class L4E2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("What is the capital of Spain");
        String answer = Input.nextLine().toUpperCase();
        if (!answer.equals("MADRID")) {
            System.out.println("Sorry, the correct answer is Madrid");
        }
        System.out.println("What is the capital of the UK");
        String answer1 = Input.nextLine().toUpperCase();
        if (!answer.equals("LONDON")) {
            System.out.println("Sorry, the correct answer is London");
        }
        System.out.println("What is the capital of Italy");
        String answer2 = Input.nextLine().toUpperCase();
        if (!answer2.equals("ROME")) {
            System.out.println("Sorry, the correct answer is Rome");
        }
    }

}