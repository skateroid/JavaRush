package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> treeSet = new TreeSet<>();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        while (true) {
            String filename = reader.readLine();
            if (filename.equals("end")) break;
            treeSet.add(filename);
            fileOutputStream = new FileOutputStream(filename.substring(0, filename.lastIndexOf('.')),true);
        }
        for (String s : treeSet) {
            fileInputStream = new FileInputStream(s);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);
            fileInputStream.close();
        }

        fileOutputStream.close();
    }
}
