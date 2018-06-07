package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String arrS[] = new String[10];
        arrS[0] = "123";
        arrS[1] = "123123";
        for (int i = 2; i < arrS.length; i++) arrS[i] = sc.nextLine();
        for (int i = arrS.length-1; i >= 0; i--){
            System.out.println(arrS[i]);
        }
    }
}

