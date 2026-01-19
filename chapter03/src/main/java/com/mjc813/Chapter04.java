package com.mjc813;

public class Chapter04 {
    public void Practice() {
//        String grade = "B";
//
//       int score1 = switch (grade) {
//           case "A" -> 100;
//           case "B" -> {
//               int result = 100 - 20;
//               score1 = result;
//           }
//           default -> 60;
//       };
//       System.out.println("score1: " + score1);
//    }
//
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if ( i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("1~100까지 정수 중 3의 배수의 총합: " + sum);

//        int x = 1;
//        int y = 1;
//        int num = (int)(Math.random()*6) + 2;
//
//        while(x + y == 5) {
//            if (x + y == 5) {
//                System.out.println("눈의 합이 5 입니다.");
//                break;
//            } else if (num==1) {
//                System.out.println("1번이 나왔습니다.");
//            }
//            else if (num==2) {
//                System.out.println("2번이 나왔습니다.");
//            }
//            else if (num==3) {
//                System.out.println("3번이 나왔습니다.");
//            }
//            else if (num==4) {
//                System.out.println("4번이 나왔습니다.");
//            }
//            else if (num==5) {
//                System.out.println("5번이 나왔습니다.");
//            }
//                else {
//                System.out.println("6번이 나왔습니다.");
//            }
//            }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        }
