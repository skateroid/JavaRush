package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (((a > b) && (a < c)) || ((a < b) && (a > c)))
            System.out.println(a);
        else if (((b > a) && (b < c)) || ((b < a)&& (b > c)))
            System.out.println(b);
        else if (((c > a) && (c < b)) || ((c < a) &&(c > b)))
            System.out.println(c);
        else if (a == b)
            System.out.println(a);
        else if (b == c)
            System.out.println(b);
        else if (b == c)
            System.out.println(c);
        else
            System.out.println(a);
    }
}
