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
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("------------------------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
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
        System.out.println("사과 1개에서 남은 양: " + result / 10.0);
    }

    public void practice() {
        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = (534 / 30);
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (534 % 30);
        System.out.println(pencilsLeft);

        int value = 356;
        System.out.println(value - 56);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double)(lengthTop+lengthBottom) * height / 2;
        System.out.println(area);
//
//        int x = 10;
//        int y = 5;
//
//        System.out.println((x>7) && (y<=5));
//        System.out.println((x%3 == 2) || (y%2 != 1));

        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double res = z + 10;
            System.out.println("결과: " + res);
        }
    }

    public void Third06() {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }

    public void Third07() {
        int charCode = 'A';

        if( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자이군요.");
        }
        if( (97<=charCode) && (charCode<=122) ) {
            System.out.println("소문자이군요.");
        }
        if( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");
        }

        int value = 6;

        if ( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value%2==0) || (value%3==0);
        if(!result) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }

    public void Third08() {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("-----------------------------");

        byte receiveData = -120;

        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }

    public void Third09() {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }

    public void Third09_1() {
        int value = 772;

        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 값: " + int1);

        byte byte2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값: " + int3);

        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값: " + int4);
    }

    public void Third10() {
        int result = 0;
        result += 10;
        System.out.println("result=" + result);
        result -= 5;
        System.out.println("result=" + result);
        result *= 3;
        System.out.println("result=" + result);
        result /= 5;
        System.out.println("result=" + result);
        result %= 3;
        System.out.println("result=" + result);
    }

    public void Third11() {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}