package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties propObject = new Properties();


    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(fileName);
        load(fis);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        for (Map.Entry<String, String> pair: properties.entrySet()) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }
        prop.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propO = new Properties();
        propO.load(inputStream);
       // propO.clear();
        Set<String> set = propO.stringPropertyNames();
        for (String s : set) {
            properties.put(s, propO.getProperty(s));
        }
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
