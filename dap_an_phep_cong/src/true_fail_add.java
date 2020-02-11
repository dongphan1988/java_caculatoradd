import java.util.Scanner;   // This will import just the Scanner class
import java.util.*;   // This will import the entire java.util package

public class true_fail_add {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Input number 1 \n");
        int number1 = input.nextInt();
        System.out.println("Input number 2 \n");
        int number2 = input.nextInt();
        System.out.println("Input answer \n");
        int expectedAnswer = input.nextInt();
        while (number1 + number2 != expectedAnswer) {
            System.out.print("Wrong answer");
            expectedAnswer = input.nextInt();
        }
        System.out.println("You got it!");
    }

}
