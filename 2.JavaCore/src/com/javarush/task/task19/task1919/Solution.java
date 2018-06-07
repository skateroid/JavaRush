package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        TreeMap<String, Double> map = new TreeMap<>();
        int count = 0;
        while (reader.ready()) {
            String s = reader.readLine();
            String[] strings = s.split(" ");
            Double d = 0.0;
            if (count == 0) map.put(strings[0], Double.valueOf(strings[1]));
            for (Map.Entry<String, Double> pair : map.entrySet()) {
                if (strings[0].equals(pair.getKey())) {
                    d = pair.getValue() + Double.valueOf(strings[1]);
                    pair.setValue(d);
                }
            }
            if (count > 0) map.put(strings[0], Double.valueOf(strings[1]));
            count++;
        }
        reader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
