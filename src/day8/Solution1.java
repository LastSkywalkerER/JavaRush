package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

/*
Модернизация ПО
*/

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> list = new HashMap<>();
        while (true) {
            String city = reader.readLine();

            if (city.isEmpty()) {
                break;
            }

            String family = reader.readLine();

            list.put(city, family);
        }

        // Read the house number
        String city = reader.readLine();

        if (list.containsKey(city)) {
            String familyName = list.get(city);
            System.out.println(familyName);
        }
    }
}

