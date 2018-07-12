package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Byte> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        while (fileInputStream.available() > 0) {
            int data;
            data = fileInputStream.read();
            list.add((byte)data);
        }
        fileInputStream.close();
        Collections.sort(list);
        LinkedHashSet<Byte> set = new LinkedHashSet<>(list);
        for (Byte b : set) {
            System.out.print(b + " ");
        }
    }
}
