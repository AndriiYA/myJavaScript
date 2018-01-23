package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream


2. Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
3. Класс AmigoOutputStream должен принимать в конструкторе обьект типа FileOutputStream.
4. Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
5. Метод close() должен сначала вызвать метод flush(), затем дописать текст, затем закрыть поток.
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream tmp;

    public  AmigoOutputStream(FileOutputStream o) throws FileNotFoundException{
    super(fileName);
    tmp = o;
}
    public void write(int b) throws IOException {
        tmp.write(b);
    }
    public void write(byte[]b) throws IOException {
        tmp.write(b);

    }
    public void write(byte[]b,int off,int len) throws IOException{
        tmp.write(b,off,len);


    }
    public void close() throws IOException{
        flush();
        String str = "JavaRush © All rights reserved.";
        write(str.getBytes());
        tmp.close();


    }
    public FileChannel getChannel(){
        return tmp.getChannel();
    }

    public void flush() throws IOException{
        tmp.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
