package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList();

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedreader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.remove(4));
        }

        for (int i = 0; i < 5; i++)
            System.out.println(strings.get(i));

    }
}