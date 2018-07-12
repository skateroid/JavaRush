package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        Date date1 = new Date(sc.nextLine());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(dateFormat.format(date1).toUpperCase());
       // String oldFormat = sc.nextLine();
       // SimpleDateFormat sm = new SimpleDateFormat("dd MM yyyy");
       // SimpleDateFormat sm2 = new SimpleDateFormat("MMM dd, yyyy");
       // Date date = sm.parse(oldFormat);
       // Date newdate = sm2.format(date);

    }
}
