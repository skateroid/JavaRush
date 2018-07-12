package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String > map = new LinkedHashMap<>();
       // map.put("name", "Ivanov");
       // map.put("country", "Ukraine");
       // map.put("city", "Kiev");
        map.put("city", null);
        map.put("age", null);
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                builder.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        if(builder.length() > 5) builder.replace(builder.length() - 5, builder.length(), "");
        return builder.toString();
    }
}
