package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        String filename = args[0];
        TreeMap<Byte, Integer> map = new TreeMap();
        ArrayList<Byte> list = new ArrayList<>();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename))) {
            while (inputStreamReader.ready()) {
                int data = inputStreamReader.read();
                list.add((byte)data);
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }
        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            char c = (char) Integer.parseInt(pair.getKey().toString());
            System.out.println(c + " " + pair.getValue());
        }
    }
}

