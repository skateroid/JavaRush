package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        ATableInterface qwer;

        public TableInterfaceWrapper(ATableInterface qwer) {
            this.qwer = qwer;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            qwer.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return qwer.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            qwer.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}