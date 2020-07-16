import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b || b == c || a == c) {
            if (a != b && a != c) System.out.println(1);
            if (b != a && b != c) System.out.println(2);
            if (c != b && c != a) System.out.println(3);
        }

    }
}