package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //напишите тут ваш код
        ArrayList<Integer> in = new ArrayList<>();
        for (int i = 0; i < 10; i++) in.add(sc.nextInt());
        for (int i = in.size() - 1; i >= 0; i--) System.out.println(in.get(i));
    }
}
