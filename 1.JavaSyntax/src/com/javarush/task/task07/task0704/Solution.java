package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++ ) arr[i] = sc.nextInt();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);
        }
    }


