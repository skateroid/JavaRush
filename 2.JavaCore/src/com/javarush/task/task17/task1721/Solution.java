package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        BufferedReader filereader1 = new BufferedReader(new FileReader(s1));
        BufferedReader filereader2 = new BufferedReader(new FileReader(s2));
        String line;
        while ((line = filereader1.readLine()) != null ) {
            allLines.add(line);
        }
        while ((line = filereader2.readLine()) != null ) {
            forRemoveLines.add(line);
        }
        solution.joinData();
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();

        }
        }
    }

