import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ( (a+b > c) && (a+c > b) && (b+c > a)) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");


    }
}
