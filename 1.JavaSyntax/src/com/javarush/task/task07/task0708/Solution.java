package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int max = 0;
        strings = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            String s = sc.next();
            if (s.length() > max) max = s.length();
            strings.add(s);
        }
        for(int i = 0; i < str.size(); i++) max = str.size();
    }
}
