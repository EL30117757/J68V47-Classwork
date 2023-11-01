import java.util.*;
public class L8E2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        //Generates 10 Random Numbers in the range 1 -20
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100 + 1);
        }//end for loop
        System.out.println("Numbers Generated: " + Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("/n"numbers);


    }

}
