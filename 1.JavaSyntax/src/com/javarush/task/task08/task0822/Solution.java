package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут



        return Collections.min(array, null);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        int n = sc.nextInt();
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ai.add(sc.nextInt());
        }

        return ai;
    }
}
