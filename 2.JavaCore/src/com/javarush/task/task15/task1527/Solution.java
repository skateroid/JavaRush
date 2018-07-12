package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String obj = "obj=";

        if(s.contains(obj)){
            double objResult;
            try {
                objResult = Double.parseDouble(s.substring(s.indexOf(obj) + obj.length(), s.indexOf("&", s.indexOf(obj))));
                System.out.println(s.substring(s.indexOf("?") + 1).replaceAll("=.*?&", " ").replaceAll("&", " ").replaceAll("=.*", " "));
                alert(objResult);
            } catch (NumberFormatException e) {
                String result = s.substring(s.indexOf("?") + 1).replaceAll("=.*?&", " ").replaceAll("&", " ").replaceAll("=.*", " ");
                alert(result);
            }

        } else
        {
            String result = s.substring(s.indexOf("?") + 1).replaceAll("=.*?&", " ").replaceAll("&", " ").replaceAll("=.*", " ");
            System.out.println(result);
          //  alert(result);
        }


    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
