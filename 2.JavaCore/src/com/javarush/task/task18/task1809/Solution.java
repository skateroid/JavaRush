package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] bufer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(bufer);
            for (int i = bufer.length - 1; i >= 0; i--) {
                fileOutputStream.write(bufer[i]);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
