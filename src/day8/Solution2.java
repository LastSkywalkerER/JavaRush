package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Минимальное из N чисел
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>();

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            integerList.add(Integer.parseInt(reader.readLine()));
        }

        return integerList;
    }
}