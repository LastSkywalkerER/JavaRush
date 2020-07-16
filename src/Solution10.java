
public class Solution10 {

    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 100) {
            System.out.print("S");
            if (counter % 10 == 0) System.out.println();
            counter++;
        }

    }
}