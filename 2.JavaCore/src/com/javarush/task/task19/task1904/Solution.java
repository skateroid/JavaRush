package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        public PersonScannerAdapter(Scanner filescanner) {
            this.fileScanner = filescanner;
        }

        private Scanner fileScanner;
        @Override
        public Person read() throws IOException, ParseException {
           // String userNameString = fileScanner.nextLine();
           // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
           // int index=0;
//
           // index = fileScanner.nextLine().indexOf("\\d");
           // String [] string = userNameString.split(" ");
//
           // Person person = new Person(string[0]
           //         ,string[1]
           //         ,string[2]
           //         ,
           //         simpleDateFormat.parse(userNameString.substring
           //                 (index,userNameString.length()).toString())
           // );
//
           // return person;
            try {
                String s = fileScanner.nextLine();
                String[] arr = s.split(" ");
                SimpleDateFormat format = new SimpleDateFormat(/*"dd MM yyyy", Locale.ENGLISH*/);
                format.applyPattern("ddMMyyyy");
                Date date = format.parse(arr[3] + arr[4] + arr[5]);
                Person person = new Person(arr[1], arr[2], arr[0], date);
                return person;
            }catch (ParseException e){
                return null;
            }
        }
        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
