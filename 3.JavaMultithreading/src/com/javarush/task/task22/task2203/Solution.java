package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        StringBuilder st = new StringBuilder();
        try {
            String[] strings = string.split("\t");
            if (strings.length <= 2) throw new Exception();
            st.append(strings[1]);
        } catch (Exception e) {
            throw new TooShortStringException();
        }
       // int index = string.indexOf("\t") + 1;
       // return string.substring(index, index + 1);
        return st.toString();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - луч\tший сервис обучения Java."));
    }
}
