package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int a = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[15];

        int sumChet = 0, sumNech = 0;

        for (int i = 0; i < 15; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            if (i % 2 == 0) {
                sumChet += arr[i];
            } else {
                sumNech += arr[i];
            }
        }

        if (sumChet > sumNech) {
            System.out.println("В домах с четными номерами проживает больше житлей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше житлей.");
        }

    }
}