package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream(reader.readLine());
        FileInputStream fis2 = new FileInputStream(reader.readLine());
        FileInputStream fis3 = new FileInputStream(reader.readLine());
        reader.close();

        byte [] buffer2 = new byte[fis2.available()];
        byte [] buffer3 = new byte[fis3.available()];
        int count2 = fis2.read(buffer2);
        int count3 = fis3.read(buffer3);
        fis2.close();
        fis3.close();

        fos.write(buffer2);
        fos.write(buffer3);
        fos.close();

    }
}
