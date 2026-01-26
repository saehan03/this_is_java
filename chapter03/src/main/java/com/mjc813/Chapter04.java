package com.mjc813;

import java.util.Scanner;

public class Chapter04 {
    public void Forth01() {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
    }

    public void Forth01_2() {
        int score = 85;
         if(score>=90) {
             System.out.println("점수가 90보다 큽니다.");
             System.out.println("등급은 A입니다.");
         } else {
             System.out.println("점수가 90보다 작습니다.");
             System.out.println("등급은 B입니다.");
         }
    }

    public void Forth01_3() {
        int score = 75;

        if(score>=90) {
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A입니다.");
        } else if(score>=80) {
            System.out.println("점수가 80~89입니다");
            System.out.println("등급은 B입니다.");
        } else if(score>=70) {
            System.out.println("점수가 70~79입니다");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70미만입니다");
            System.out.println("등급은 D입니다.");
        }
    }

    public void Forth01_4() {
        int num = (int)(Math.random()*6) + 1;

        if(num==1) {
            System.out.println("1번이 나왔습니다.");
        } else if(num==2) {
            System.out.println("2번이 나왔습니다.");
        } else if(num==3) {
            System.out.println("3번이 나왔습니다.");
        } else if(num==4) {
            System.out.println("4번이 나왔습니다.");
        } else if(num==5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }

    public void Forth02_2() {
        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수: " + score);

        String grade;

        if(score>=90) {
            if(score>=95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if(score>=85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        System.out.println("학점:" + grade);
    }

    public void SwithEx() {
        int num = (int)(Math.random()*6) + 1;

        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
    public void SwithNoBreakCaseEx() {
        int time = (int)(Math.random()*4) + 8;
        System.out.println("[현재 시간 : " + time + "시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }

    public void SwitchCharEx() {
        char grade = 'B';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }

    public void SwitchExpressionsEx() {
        char grade = 'B';

        switch(grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }
    }

    public void SwitchValueEx() {
        String grade = "B";

        int score1 = 0;
        switch(grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        int score2 = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
    }

    public void PrintFromTo10Ex() {
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
    }

    public void SumFromTo10Ex() {
        int sum = 0;
        int i;

        for(i=0; i<=100; i++) {
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }

    public void FloatCounterEx() {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }

    public void MultiplicatinTableEx() {
        for (int m=2; m<=9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m*n));
            }
        }
    }

    public void WhilePrintFromTo10Ex() {
        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
    }

    public void SumFrom1To100Ex() {
        int sum = 0;

        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }

//    public void DoWhileEx() {
//        System.out.println("메시지를 입력하세요.");
//        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
//
//        Scanner scanner = new Scanner(System.in);
//        String inputString;
//
//        do {
//            System.out.print(">");
//            inputString = scanner.nextLine();
//            System.out.println(inputString);
//        } while( ! inputString.equals("q"));
//
//        System.out.println();
//        System.out.println("프로그램 종료");
//    }

    public void BreakEx() {
        while(true) {
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }

    public void BreakOutterEx() {
        Outter: for(char upper='A'; upper<='Z'; upper++) {
        for(char lower='a'; lower<='z'; lower++) {
            System.out.println(upper + "-" + lower);
            if(lower=='g') {
                break Outter;
            }
        }
        }
        System.out.println("프로그램 실행 종료");
    }

    public void ContinueEx() {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

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
