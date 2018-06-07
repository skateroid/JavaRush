package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 11;
        this.color = "das";
        this.weight = 22;

    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "32";
        this.weight = 3;

    }
    public void initialize(int weight, String color) {
        this.age = 6;
        this.color = color;
        this.weight = weight;

    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "sffds";
        this.weight = weight;

    }

    public void initialize(int weight, String color, String address ) {
        this.age = 11;
        this.color = color;
        this.weight = weight;
        this.address = address;

    }
    public static void main(String[] args) {

    }
}
