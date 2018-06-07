package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        String s;

        while (true) {
            s = sc.nextLine();
            if (s.equals("сумма"))
                break;
            int a = Integer.parseInt(s);
            sum += a;
        }
        System.out.println(sum);
    }
}
