package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (fileInputStream.available() < 1000) {
               // byte[] bufer = new byte[fileInputStream.available()];
               // if (bufer.length < 1000) {
               //
               // }
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
