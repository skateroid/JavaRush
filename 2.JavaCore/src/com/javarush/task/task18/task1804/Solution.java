package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Byte> list = new ArrayList<>();
        HashMap<Byte, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int max_byte = 0;
        while (fileInputStream.available() > 0) {
            int data;
            data = fileInputStream.read();
            list.add((byte)data);
        }
        fileInputStream.close();
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }
        int max = Collections.min(map.values());
        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            if(pair.getValue() == max) System.out.print(pair.getKey() + " ");
        }
    }
}
