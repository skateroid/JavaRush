package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] arr = new int[10];
        String[] str = new String[10];
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
            arr[i] = str[i].length();}
        for(int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
