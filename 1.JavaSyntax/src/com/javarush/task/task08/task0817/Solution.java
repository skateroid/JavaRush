package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров","Алексей");
        map.put("Петр","Иван");
        map.put("Ивано","Алексей");
        map.put("Сидоро","Алексей");
        map.put("Сидоров","Иван");
        map.put("Иванов","Игорь");
        map.put("Чёрный","Алексей");
        map.put("Чёрны","Олег");
        map.put("Чёрн","Дима");
        map.put("Чёр","Иван");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> temp = new HashMap<>(map);
        ArrayList<String> list = new ArrayList<>(map.values());
        for (Map.Entry<String, String> pair: temp.entrySet()
             ) {
            if (Collections.frequency(list, pair.getValue()) > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
