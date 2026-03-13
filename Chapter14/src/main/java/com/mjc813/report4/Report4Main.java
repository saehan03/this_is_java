package com.mjc813.report4;

import java.util.Scanner;

public class Report4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Report4Plus rp4 = new Report4Plus();
        rp4.start();

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                rp4.interrupt();
                break;
            }

            char newChar = input.charAt(0);
            rp4.setTargetChar(newChar);
        }

        sc.close();
    }
}
