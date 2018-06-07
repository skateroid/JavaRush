package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        while (reader1.ready()) {
            String string = reader1.readLine();
            String[] strings = string.split(" ");
            for (String s : strings) {
                if (s.matches("\\d+") && !s.matches("\\D+")) {
                    writer.write(s + " ");
                }
            }
        }
        reader1.close();
        writer.close();
    }
}
