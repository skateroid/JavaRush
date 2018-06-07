package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int indMin = 0, indMax = 0;
        int min = 0, max = 0;

        for (int i = 0; i < 10; i++)
        {    String s = buf.readLine();
            list.add(s);
        }
        for (int i = 0; i < 10; i++)
        {   if ((list.get(i).length()) > max)
        {   max = list.get(i).length();  indMax = i;      }
        }
        for (int i = 0; i < 10; i++)
        {   if (i == 0) { min = max;}
            if ((list.get(i).length()) < min)
            {min = list.get(i).length();  indMin = i;     }
        }
        if (indMax<indMin)
        { System.out.println(list.get(indMax));   }
        if (indMin<indMax)
        { System.out.println(list.get(indMin));   }
    }
}
