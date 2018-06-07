package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileContent = "";
        private String fileName;

        public void run() {
           // try {
           //     BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(this.filename)));
           //     while ((this.fileContent = bf.readLine()) != null) {
           //         this.fileContent += this.fileContent + " ";
           //     }
           // } catch (FileNotFoundException e) {
           //     e.printStackTrace();
           // } catch (IOException e) {
           //     e.printStackTrace();
           // }
       // }
            StringBuilder s=new StringBuilder();
            try(BufferedReader reader1=new BufferedReader(new FileReader(new File(fileName)))){
                while(reader1.ready())s.append(reader1.readLine()).append(" ");
            }catch(IOException e){}
            fileContent=s.toString();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.fileContent;
        }
    }
    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
