package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        for (int i = 0; i < b.length; i++) b[i] = a[i];
        for (int i = 10; i < a.length; i++) {
            c[i - c.length] = a[i];
            System.out.println(c[i - c.length]);
        }
    }
}
