package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        getTokens("dghsdeeghsgd jhgesdekjh kjdeeehsg jkdehskejd shkgdee skgdsh", "e");

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stringTokenizer.nextToken();
        }
        return result;
    }
}
