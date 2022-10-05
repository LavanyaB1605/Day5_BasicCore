//Program to Flip coin
public class FlipCoin {
    public static void  main(String[] args) {
        double coinSide = Math.random();
        System.out.println(coinSide);
        if(coinSide < 0.5) {
            System.out.println("Tails"); }
        else {
            System.out.println("Heads");
        }
    }
}
