import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int counter = 0;

        if (a > 0) counter++;
        if (b > 0) counter++;
        if (c > 0) counter++;

        System.out.println(counter);
    }
}