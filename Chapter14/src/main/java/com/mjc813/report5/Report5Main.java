package com.mjc813.report5;

import com.mjc813.report5.Report5Plus;
import com.mjc813.report5.Report5Avg;

import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Report5Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        Report5Plus rp5 = new Report5Plus();
        rp5.start();

        Report5Avg rp5_1 = new Report5Avg();
        rp5_1.start();

        Report5Sort rp5_2 = new Report5Sort();
        rp5_2.start();

        Report5Odd rp5_3 = new Report5Odd();
        rp5_3.start();

        Report5Even rp5_4 = new Report5Even();
        rp5_4.start();

     while (true) {
        String input = sc.next();

         if (input.equalsIgnoreCase("exit")) {
             rp5.interrupt();
             break;
         }

         char newChar = input.charAt(N);
         rp5.setTargetChar(newChar);
         rp5_1.setTargetChar(newChar);
         rp5_2.setTargetChar(newChar);
         rp5_3.setTargetChar(newChar);
         rp5_4.setTargetChar(newChar);
    }
        sc.close();
    }
}
