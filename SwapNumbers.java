import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[]args) {
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        int temp = 0;

        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping the numbers: \n First Number is "+number1 );
        System.out.println("\n Second Number is "+number2 );
    }
}
