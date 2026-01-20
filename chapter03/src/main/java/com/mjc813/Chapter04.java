package com.mjc813;

import java.util.Scanner;

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
        // 확인문제 3번
        int i = 1;
//        for (;;) {
//            if (i > 100) {
//                break;
//            } else if (i % 3 == 0) {
//                System.out.println("i = " + i);
//            }
//        }

        while(i < 100) {
            if (i % 3 == 0) {
                System.out.println("while i = " + i);
            }
            i++;
        }

        // 확인문제 4번
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

//  확인문제 6번
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//  확인문제 7번
//        Scanner scanner = new Scanner(System.in);
//        boolean run = true;
//        int speed = 10000;
//
//        while(run) {
//            System.out.println("--------------------------");
//            System.out.println("1 . 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//            System.out.println("--------------------------");
//            System.out.println("선택> ");
//
//            String strNum = scanner.nextLine();
//
//            if(strNum.equals("1")) {
//                speed++;
//                System.out.println("예금액> " + speed);
//            } else if(strNum.equals("2")) {
//                speed++;
//                System.out.println("출금액> = " + speed);
//            } else if(strNum.equals("3")) {
//                speed--;
//                System.out.println("잔고> = " + speed);
//            } else if(strNum.equals("4")) {
//                run = false;
//            }
//        }
//
//        System.out.println("프로그램 종료");
    }
}
