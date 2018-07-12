package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public  static Scanner sc = new Scanner(System.in);
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String vol = "", oth = "";
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') i++;
            if (isVowel(st.charAt(i))) vol += st.charAt(i) + " ";
            else oth += st.charAt(i) + " ";
        }
        System.out.println(vol);
        System.out.println(oth);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}