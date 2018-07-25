package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    static String words[];
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //String fileName = "x:/1.txt";
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder data = new StringBuilder();
        while (fileReader.ready()) {
            data.append(fileReader.readLine()).append(" ");
        }
        words = data.toString().trim().split(" ");
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

   // public static StringBuilder getLine(String... words) {
   //     if (words.length == 0) return new StringBuilder("");
   //     Arrays.sort(words);
   //     StringBuilder result = new StringBuilder();
   //     String buf = words[0];
   //     result.append(words[0]).append(" ");
   //     for (int i = 1; i < words.length; i++) {
   //         for (int j = 1; j < words.length; j++) {
   //            char[] c1 = buf.toCharArray();
   //            char[] c2 = words[j].toCharArray();
   //            String s1 = String.valueOf(c1[c1.length - 1]);
   //            String s2 = String.valueOf(c2[0]);
   //             if (s1.equalsIgnoreCase(s2)) {
   //                 buf = words[j];
   //                 result.append(words[j]).append(" ");
   //                 words[j] = String.valueOf(Math.RANDOM());
   //                 break;
   //             }
   //         }
   //     }
   //       return result;
   // }
   public static StringBuilder getLine(String... words) {
       String wordsS[] = new String[words.length];
       System.arraycopy(words, 0, wordsS, 0, words.length);
       Arrays.sort(wordsS);
       StringBuilder str = new StringBuilder();
       StringBuilder lost = new StringBuilder();
       if (wordsS.length == 0)
           return str;
       str.append(wordsS[0]);
       for (int j = 1; j < wordsS.length; j ++) {
           String begin = str.substring(0, 1).toLowerCase();
           String end = str.substring(str.length() - 1, str.length()).toLowerCase();
           String beginJ = wordsS[j].substring(0, 1).toLowerCase();
           String endJ = wordsS[j].substring(wordsS[j].length() - 1, wordsS[j].length());
           if (beginJ.equals(end)) {
               str.append(" ");
               str.append(wordsS[j]);
               wordsS[j] = null;
           } else if (endJ.equals(begin)) {
               String tmp = wordsS[j] + " " + str;
               str = new StringBuilder(tmp);
               wordsS[j] = null;
           }
           else {
               lost.append(" ");
               lost.append(wordsS[j]);
           }

       }
       return str.append(lost);
   }
}
