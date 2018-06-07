package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
       // String fileName = args[0];
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
      //  BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        try(BufferedReader fileReader=new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String string = fileReader.readLine();
                // String[] strings = string.split(" ");
                String name = string.replaceAll("[0-9]", "").trim();
                String date2 = string.replaceAll("^\\D+", "");
               // String date2 = string.replaceAll("^[0-9]", "");
                Date date = formatter.parse(date2);
                // String date = strings[strings.length - 3] + " " + strings[strings.length - 2] + " " + strings[strings.length - 1];
                PEOPLE.add(new Person(name.toString(), date));
            }
        }
        catch (IOException e) {

        }
        //fileReader.close();
    }
}
