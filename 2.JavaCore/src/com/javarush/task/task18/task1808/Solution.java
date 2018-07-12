package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
            fileOutputStream1.write(buffer, 0, count - count/2);
            fileOutputStream2.write(buffer, count - count/2, count - (count - count/2));
        }
        fileOutputStream1.close();
       // while (fileInputStream.available() > 0) {
       //     int data = fileInputStream.read();
       //     fileOutputStream2.write(data);
       // }
        fileInputStream.close();
        fileOutputStream2.close();
    }
}
