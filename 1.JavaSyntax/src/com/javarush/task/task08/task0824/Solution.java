package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childd = new ArrayList<>();
        Human child1 = new Human("123", true, 12, childd);
        Human child2 = new Human("1243", true, 12, childd);
        Human child3 = new Human("1233", true, 12, childd);
        ArrayList<Human> mamaA = new ArrayList<>();
        mamaA.add(child1);
        mamaA.add(child2);
        mamaA.add(child3);
        Human mama = new Human("mama", false, 23, new ArrayList<>(mamaA));
        ArrayList<Human> papaA = new ArrayList<>();
        papaA.add(child1);
        papaA.add(child2);
        papaA.add(child3);
        Human papa = new Human("papa", true, 43, new ArrayList<>(papaA));
        ArrayList<Human> dedM = new ArrayList<>();
        dedM.add(mama);
        ArrayList<Human> babM = new ArrayList<>();
        babM.add(mama);
        ArrayList<Human> dedP = new ArrayList<>();
        dedP.add(papa);
        ArrayList<Human> babP = new ArrayList<>();
        babP.add(papa);
        Human dedMa = new Human("123122", true, 76, new ArrayList<>(dedM));
        Human babMa = new Human("342", false, 65, new ArrayList<>(babM));
        Human dedPa = new Human("563", true, 76, new ArrayList<>(dedP));
        Human babPa = new Human("5436", false, 56, new ArrayList<>(babP));
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(dedMa);
        System.out.println(dedPa);
        System.out.println(babMa);
        System.out.println(babPa);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

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