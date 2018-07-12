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
        //String fileName = args[0];
         String fileName = "x:/1.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        TreeMap<String, Double> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        int count = 0;
        while (reader.ready()) {
            String s = reader.readLine();
            String[] strings = s.split(" ");
            Double value = Double.valueOf(strings[1]);
            String name = strings[0];
            map.put(name, map.containsKey(name) ? map.get(name) + value : value);
           /* Double d = 0.0;
            if (count == 0) map.put(strings[0], Double.valueOf(strings[1]));
            else {
                for (Map.Entry<String, Double> pair : map.entrySet()) {
                    //Double d = 0.0;
                   // if (count == 0) break;
                    if (strings[0].equals(pair.getKey())) {
                        d = pair.getValue() + Double.valueOf(strings[1]);
                       // map.put(strings[0], d);
                        pair.setValue(d);
                    }
                }
                if (d == 0.0) map.put(strings[0], Double.valueOf(strings[1]));
                //if (count > 0) map.put(strings[0], Double.valueOf(strings[1]));
            }
            count++;
        }*/
        }
            reader.close();
            for (Map.Entry<String, Double> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
            // map.entrySet().stream()
            //         .sorted(Map.Entry.<String, Double>comparingByValue())
            //         .forEach(System.out::println);
        }
    }

