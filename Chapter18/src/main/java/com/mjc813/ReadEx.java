package com.mjc813;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.FileReader;

public class ReadEx {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            reader = new FileReader("C:/Temp/test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.print((char) data);
                ;
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
//        try {
//            InputStream is = new FileInputStream("C:/Temp/test2.txt");
//
//            byte[] data = new byte[100];
//
//            while (true) {
//                int num = is.read(data);
//                if (num == -1) break;
//
//                for (int i = 0; i < num; i++) {
//                    System.out.println(data[i]);
//                }
//            }
//
//            is.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();

//            while(true) {
//                int data = is.read();
//                if(data == -1) break;
//                System.out.println(data);
//            }
//
//            is.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
        }
    }
}
