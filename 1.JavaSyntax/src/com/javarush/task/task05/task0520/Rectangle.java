package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public Rectangle(int left, int top, int height, int width) {
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }
    public Rectangle(int top, int width, int height) {
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(int width) {
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
