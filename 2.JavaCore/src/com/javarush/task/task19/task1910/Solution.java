package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        while ((line = reader1.readLine()) != null) {stringBuilder.append(line);}
        //while (reader1.ready()) {
        //    stringBuilder.append(reader1.readLine());
           // String string = reader1.readLine();
           // String[] strings = string.split(" ");
           // for (String s : strings) {
           //    if (s.matches("\\w\n"));
           // }
        //}
        reader1.close();
        String res = stringBuilder.toString().replaceAll("\\pP|\\n", "");
       // res = res.replaceAll("\\W\n", "");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        writer.write(res);
        writer.close();
    }
}
