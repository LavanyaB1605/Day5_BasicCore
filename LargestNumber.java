public class LargestNumber {
    public static void main(String args[]) {
        int array[] = {28, 70, 49};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest Element of this Array:" +max);
    }
}
