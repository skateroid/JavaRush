package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("1", " 2");
        map.put("3", " 22");
        map.put("4", " 23");
        map.put("5", " 24");
        map.put("6", " 25");
        map.put("7", " 26");
        map.put("8", " 27");
        map.put("9", " 28");
        map.put("10", " 29");
        map.put("11", " 20");
    return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int n = 0;
        for (String names: map.values()
             ) {
            if (names == name) n++;
        }
return n;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int n = 0;
        for (String names: map.keySet()
                ) {
            if (names == lastName) n++;
        }
        return n;
    }

    public static void main(String[] args) {

    }
}
