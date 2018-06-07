package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file11 = reader.readLine();
        String file22 = reader.readLine();

        reader.close();
        FileInputStream fis1 = new FileInputStream(file11);
        byte[] file1 = new byte[fis1.available()];
        int count1 = fis1.read(file1);
        fis1.close();
        FileOutputStream fos1 = new FileOutputStream(file11);
        FileInputStream fis2 = new FileInputStream(file22);
        byte[] file2 = new byte[fis2.available()];
        int count2 = fis2.read(file2);
        fis2.close();
        fos1.write(file2);
        fos1.write(file1);
        fos1.close();
    }
}
