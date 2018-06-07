package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        String filename = args[0]/*"C:/11.txt"*/;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename))) {
            int count_main = 0;
            int count_space = 0;
            while (inputStreamReader.ready()) {
                count_main++;
                // char c = (char) inputStreamReader.read();
                int data = inputStreamReader.read();
                if (data == 32) count_space++;
            }
            double count_mainD = (double) count_main;
            double count_spaceD = (double) count_space;
            Double result = Double.valueOf(count_spaceD / count_mainD * 100);
           // System.out.println(result);
            System.out.format("%.2f", result);
           // System.out.println(String.format("%.2f", count_space / count_main * 100));
        }

    }
}
