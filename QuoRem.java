//Program to Compute Quotient and Remainder
import java.util.Scanner;

public class QuoRem {
    public static void  main(String[] args) {
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        int quotient;
        int reminder;
    quotient = number1 / number2;
        System.out.printf("Quotient of the given numbers are: " +quotient);

        System.out.printf("\n");

    reminder = number1 % number2;
        System.out.println("Remainder of the given numbers are: " +reminder);
    }
}
