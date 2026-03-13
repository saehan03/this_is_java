package com.mjc813.report2;

public class Report2Main {
    public static void main(String[] args) {

        Thread rp2 = new Thread(new Report2_5to9());
        rp2.start();

        for (int dan = 2; dan <= 4; dan++) {
            for(int num = 1; num<=9; num++) {
                System.out.println(String.format("%d * %d = %d", dan, num, dan*num));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
