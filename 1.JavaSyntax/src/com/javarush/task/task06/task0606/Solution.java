package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int lastVal;
        do {

            lastVal = a % 2;
            if (lastVal == 0) even++;
            else odd++;
            a = a / 10;
        } while (a != 0);
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
