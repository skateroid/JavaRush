package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        //System.out.println(getPartOfString("1 2 3 4 LAST 6"));
        //System.out.println(getPartOfString("1 2 3 4 5 LAST"));
    }

    public static String getPartOfString(String string) {
       // StringBuilder result = new StringBuilder();
       // String[] strings = string.split(" ");
       // if (strings.length < 5) throw new TooShortStringException();
       // for (int i = 1; i < 5; i++) {
       //     result.append(strings[i] + " ");
       // }
       // return result.toString().trim();

        /*int found = 0;
        int index = -1;
        try {
            do {
                index = string.indexOf(" ", index + 1);
                found++;
            } while (found < 5);
            if (index < 0 && found == 5)
                return string.substring(string.indexOf(" ") + 1, string.length());
            else
                return string.substring(string.indexOf(" ") + 1, index);
        } catch (RuntimeException e ) {
            throw new TooShortStringException();
        }*/
        StringBuilder result = new StringBuilder();
        try {
            String[] strings = string.split(" ");
             for (int i = 1; i < 5; i++) {
                 result.append(strings[i] + " ");
             }
        } catch (RuntimeException e) {
            throw new TooShortStringException();
        }
        return result.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
