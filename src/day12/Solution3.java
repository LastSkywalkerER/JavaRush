package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Solution3 {

    public static Set<Integer> createSet() throws IOException {
        // напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();

        while (set.size() < 20){
            int zapolnitel = random.nextInt(diff + 1);
            zapolnitel += min;
            set.add(zapolnitel);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) throws Exception {
        Set<Integer> set = createSet();
        System.out.println(set);
        System.out.println(removeAllNumbersGreaterThan10(set));
    }
}