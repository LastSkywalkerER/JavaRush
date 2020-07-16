import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int counter1 = 0;
        int counter2 = 0;

        if (a > 0) counter1++;
        if (b > 0) counter1++;
        if (c > 0) counter1++;
        if (a < 0) counter2++;
        if (b < 0) counter2++;
        if (c < 0) counter2++;

        System.out.println("количество отрицательных чисел: " + counter2);
        System.out.println("количество положительных чисел: " + counter1);
    }
}