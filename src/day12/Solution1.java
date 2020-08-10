package day12;


/*
Семейная перепись
*/

public class Solution1 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandPa1 = new Human("grandPa1", true, 50);

        Human grandPa2 = new Human("grandPa2", true, 50);

        Human grandMa1 = new Human("grandMa1", false, 50);

        Human grandMa2 = new Human("grandMa2", false, 50);

        Human pa = new Human("pa", true, 50, grandPa1, grandMa1);

        Human ma = new Human("ma", false, 50, grandPa2, grandMa2);

        Human child1 = new Human("child1", true, 50, pa, ma);

        Human child2 = new Human("child2", true, 50, pa, ma);

        Human child3 = new Human("child3", true, 50, pa, ma);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);



    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}