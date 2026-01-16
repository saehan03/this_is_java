package com.mjc813;

public class Chapter03 {
    public void Third01() {
//        int x = -100;
//        x = -x;
//        System.out.println("x: " + x);
//
//        byte b = 100;
//        int y = -b;
//        System.out.println("y: " + y);

        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("--------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    public void Third02() {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10l;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2;
        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }

    public void Third03() {
        byte var1 = 125;
        for(int i=0; i<5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("------------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }
    }

    public void Third04() {
//        int apple = 1;
//        double pieceUnit = 0.1;
//        int number = 7;
//
//        double result = apple - number*pieceUnit;
//        System.out.println("사과 1개에서 남은 양: " + result);

        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}