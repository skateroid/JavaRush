package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; ; i++) {
            list.add(fileReader.readLine());
            if (list.get(i) == null) break;
        }

        list.remove(null);

        reader.close();
        fileReader.close();

        int[] listInt = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            listInt[i] = ((Integer.parseInt(list.get(i))));
        }

        Arrays.sort(listInt);
        for (int e : listInt) {
            if (e % 2 == 0) System.out.println(e);
        }

    }
}