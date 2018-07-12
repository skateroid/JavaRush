package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int i = 1;
        do {
            result += s;
            i++;

        } while (i <= 5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int i = 1;
        do {
            result += s;
            i++;

        } while (i <= count);
        return result;
    }

    public static void main(String[] args) {

    }
}
