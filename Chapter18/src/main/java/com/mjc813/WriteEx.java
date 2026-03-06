package com.mjc813;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WriteEx {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("C:/Temp/test.txt");

            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            writer.write("FGH");

            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
//        try {
//            OutputStream os = new FileOutputStream("C:/Temp/test.txt");
//
//            byte[] array = {10, 20, 30, 40, 50};
//
//            os.write(array, 1, 3);
//
//            os.flush();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();

//            byte[] array = {10, 20, 30};
//
//            os.write(array);
//
//            os.flush();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();

//            byte a = 10;
//            byte b = 20;
//            byte c = 30;
//
//            os.write(a);
//            os.write(b);
//            os.write(c);
//
//            os.flush();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
        }
    }
}
