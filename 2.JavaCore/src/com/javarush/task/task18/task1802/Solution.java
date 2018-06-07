package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int max_byte = 333;
        while (fileInputStream.available() > 0) {
            int data;
            data = fileInputStream.read();
            if(data < max_byte) max_byte = data;
        }
        System.out.println(max_byte);
        fileInputStream.close();
    }
}
