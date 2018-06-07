package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double sum = 0;

        for(int n = 1; true; n++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sum += a;

            if (a == -1) {
                double s = (sum + 1) / (n - 1);
                System.out.println(s);
                break;
            }
        }


    }
}

