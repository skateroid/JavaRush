package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Alex1", new Date("MAY 1 1980"));
        map.put("Alex2", new Date("JUNE 1 1980"));
        map.put("Alex3", new Date("JULY 1 1980"));
        map.put("Alex4", new Date("DECEMBER 1 1980"));
        map.put("Alex5", new Date("OCTOBER 1 1980"));
        map.put("Alex6", new Date("SEPTEMBER 1 1980"));
        map.put("Alex7", new Date("JULY 1 1980"));
        map.put("Alex8", new Date("JULY 1 1980"));
        map.put("Alex9", new Date("SEPTEMBER 1 1980"));
        map.put("Alex10", new Date("SEPTEMBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        map.values().removeIf(date -> date.getMonth() >= 5 && date.getMonth() <= 7);
    }

    public static void main(String[] args) {

    }
}
