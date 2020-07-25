package day7;

/*
Собираем семейство
*/

import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human();
        son1.name = "Jack";
        son1.sex = true;
        son1.age = 12;

        Human son2 = new Human();
        son2.name = "Fill";
        son2.sex = true;
        son2.age = 13;

        Human son3 = new Human();
        son3.name = "Doom";
        son3.sex = true;
        son3.age = 14;

        Human pa = new Human();
        pa.name = "Herman";
        pa.sex = true;
        pa.age = 30;
        pa.children.add(son1);
        pa.children.add(son2);
        pa.children.add(son3);

        Human ma = new Human();
        ma.name = "Valya";
        ma.sex = false;
        ma.age = 31;
        ma.children.add(son1);
        ma.children.add(son2);
        ma.children.add(son3);

        Human grandPa1 = new Human();
        grandPa1.name = "Bob";
        grandPa1.sex = true;
        grandPa1.age = 60;
        grandPa1.children.add(pa);

        Human grandPa2 = new Human();
        grandPa2.name = "Jaja";
        grandPa2.sex = true;
        grandPa2.age = 65;
        grandPa2.children.add(ma);

        Human grandMa1 = new Human();
        grandMa1.name = "Kate";
        grandMa1.sex = false;
        grandMa1.age = 60;
        grandMa1.children.add(pa);

        Human grandMa2 = new Human();
        grandMa2.name = "Sandra";
        grandMa2.sex = false;
        grandMa2.age = 65;
        grandMa2.children.add(ma);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}


















