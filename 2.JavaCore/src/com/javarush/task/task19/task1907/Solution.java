package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append((char) fileReader.read());
        }
        fileReader.close();
        String[] strings = stringBuilder.toString().split("\\W");
        for (String s : strings) {
            if (s.equals("world")) count++;
        }
        System.out.println(count);
    }
}
