import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        if ( a < b ) System.out.println(a);
        else System.out.println(b);


    }
}