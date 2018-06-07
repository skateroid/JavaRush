package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
   //    InputStream inStram = new FileInputStream("c:/java/1.txt");
   //    while (inStram.available() > 0) {
   //        int data = inStram.read();
   //        System.out.println(data);
   //    }
   //    inStram.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                FileInputStream fis = new FileInputStream(reader.readLine());

                while (fis.available() > 0){
                    System.out.print((char) fis.read());
                }
                System.out.println();
                reader.close(); //закрыт поток ввода в консоль
                fis.close(); //закрыт поток открытого файла
                //System.out.println("все сделал");

                break;
            }catch (Exception e){
                System.out.println("Такой файл не найден!");
                continue;
            }

        }
   }
}