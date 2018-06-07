package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
       private static String name;
       private static boolean sex;
       private static int age;
       private static int weight;
       private static int zp;
       private static int hp;

       public Human(String name) {
            this.name = name;
        }
        public Human(String name, int age ) {
            this.name = name;
            this.age = age;
        }
        public  Human(boolean sex, int age) {
            this.sex = sex;
            this.age = age;
        }
        public  Human(int age, boolean sex) {
            this.sex = sex;
            this.age = age;
        }
        public  Human(int age, String name ) {
            this.name = name;
            this.age = age;
        }
        public  Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public  Human(int zp, int age, int weight) {
            this.zp = zp;
            this.age = age;
            this.weight = weight;
        }
        public Human(int zp, int age, int weight, int hp) {
            this.zp = zp;
            this.age = age;
            this.weight = weight;
            this.hp = hp;
        }
        public Human(int zp, int age, int weight, int hp, String name) {
            this.zp = zp;
            this.age = age;
            this.weight = weight;
            this.hp = hp;
            this.name = name;
        }
        public  Human(int zp, int age, int weight, int hp, String name, boolean sex) {
            this.zp = zp;
            this.age = age;
            this.weight = weight;
            this.hp = hp;
            this.name = name;
            this.sex = sex;
        }


    }
}
