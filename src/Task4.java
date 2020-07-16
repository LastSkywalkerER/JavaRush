import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task4 {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c, int d) {
        return max(a,b) > max(c,d) ? max(a,b) : max(c,d);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        System.out.println(max(a,b,c,d));

    }
}