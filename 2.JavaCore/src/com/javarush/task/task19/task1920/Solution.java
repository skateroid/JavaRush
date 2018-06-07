package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
      //  BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
      //  String fileName = "c:/1.txt";
        String fileName = args[0];
      //  FileReader fileReader = new FileReader(fileName);

        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            String[] strings = fileReader.readLine().split(" ");
            String name = strings[0];
            Double value = Double.valueOf(strings[1]);
            map.put(name, map.containsKey(name) ? map.get(name) + value : value);
        }
        fileReader.close();
        Double max = Collections.max(map.values());
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue().equals(max)) System.out.println(pair.getKey());
        }
    }
}
