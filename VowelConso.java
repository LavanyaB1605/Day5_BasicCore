//Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;

public class VowelConso {
    public static void main(String[]args) {
        System.out.println("Enter an Alphabet ");
        Scanner obj1 = new Scanner(System.in);
        String ch = obj1.nextLine();
        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}
