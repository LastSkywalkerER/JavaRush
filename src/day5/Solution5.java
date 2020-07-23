package day5;

import java.io.IOException;

public class Solution5 {

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) throws IOException {

        printIdea(new Idea());

    }

    public static class Idea {
        public String getDescription() {
            return "Дароу";
        }
    }

}
