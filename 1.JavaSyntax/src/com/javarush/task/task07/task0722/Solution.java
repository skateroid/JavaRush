package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size() + 1; i++) {
            String s = sc.nextLine();
            if (s.equals("end")) break;
            else list.add(s);
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}