package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        int a = 0;
        while ( a != -1) {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            sum += a;
        }

        System.out.println(sum);
    }
}
