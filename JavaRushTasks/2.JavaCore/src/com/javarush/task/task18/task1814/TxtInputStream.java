package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
Например, first.txt или name.1.part3.txt.
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение nsupportedFileNameException.
Подумай, что еще нужно сделать, в случае выброшенного исключения.
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream fileName;
    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        if (fileName.endsWith(".txt")) // проверяет, заканчивается ли эта строка указанным окончанием.
            this.fileName = new FileInputStream(fileName);
        else {
            super.close();//3. Если в конструктор передан не txt-файл, должно быть выброшено исключение UnsupportedFileNameException.
            throw new UnsupportedFileNameException();
            //В случае выброшенного исключения, так же должен быть вызван super.close().
        }
    }
    public static void main(String[] args) {
    }
}

