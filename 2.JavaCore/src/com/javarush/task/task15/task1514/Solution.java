package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(213.0, "das");
        labels.put(2123.0, "das");
        labels.put(21223.0, "das");
        labels.put(2133.0, "das");
        labels.put(2413.0, "das");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
