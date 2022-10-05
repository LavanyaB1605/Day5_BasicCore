//To find if it's a leap year or not
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter an Year :: ");
        Scanner leap = new Scanner(System.in);
        year = leap.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}
