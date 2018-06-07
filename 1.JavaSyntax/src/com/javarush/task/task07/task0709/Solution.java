package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    static int min;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) strings.add(reader.readLine());
        min = strings.get(0).length() ;
        for (int i = 0; i < 5; i++) if (strings.get(i).length() < min) min = strings.get(i).length();

        for (String s: strings) {
            if (s.length() <= min) System.out.println(s);
        }
    }
}
