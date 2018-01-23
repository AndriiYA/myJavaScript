package com.javarush.task.task18.task1815;

import java.util.List;

/* 

Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().


Требования:
1. Класс TableInterfaceWrapper должен реализовывать интерфейс ATableInterface.
2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа ATableInterface.
3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {

        ATableInterface pole;
        public TableInterfaceWrapper(ATableInterface pole){
            this.pole = pole;
        }
        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());//Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
            this.pole.setModel(rows); // команда обновления модели
        }

        @Override
        public String getHeaderText() {
            return this.pole.getHeaderText().toUpperCase();//Метод getHeaderText() должен возвращать текст в верхнем регистре.
        }

        @Override
        public void setHeaderText(String newHeaderText) {

            this.pole.setHeaderText(newHeaderText);//Метод setHeaderText() должен устанавливать текст для заголовка без изменений
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