package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            String IsEmpty = !users.isEmpty()? "Yes":"No";
            writer.println(IsEmpty);
            if(IsEmpty.equals("Yes")){
                for(User a:users){
                    writer.println(a.getFirstName());
                    writer.println(a.getLastName());
                    long date = a.getBirthDate().getTime();
                    writer.println(date);
                    writer.println(a.isMale());
                    writer.println(a.getCountry());
                }
            }

            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String IsEmpty = reader.readLine();
            if(IsEmpty.equals("Yes")){
                while(reader.ready()){
                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    long time = Long.parseLong(reader.readLine());
                    Date date = new Date(time);
                    user.setBirthDate(date);
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    String country = reader.readLine();
                    switch (country){
                        case "Ukraine":{
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        }
                        case "Russia":{
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        }
                        case "Other":{
                            user.setCountry(User.Country.OTHER);
                            break;
                        }
                    }

                    users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
