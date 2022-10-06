import java.util.Scanner;

public class Power {
    public static void  main(String[] args) {
        double power;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i =0; i <= n; i++) {
            power = (Math.pow(2 , n));
            System.out.println("Value of 2 ^ " +n+ " is " +power);
        }
    }
}
