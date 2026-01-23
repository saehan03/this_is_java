package com.mjc813;

public class Chapter06 {

    public void studentSample() {
        Student s1 = new Student();
        System.out.println("s1 변수가  Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");
    }

    public void car1Example() {
        Car1 myCar = new Car1();

        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
    }

    public void Car2eaxmple() {

        Car2 myCar = new Car2();

        System.out.println("제작회사 :" + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }

    public void koreanSample() {
        Korean k1 = new Korean("박자바", "011225-1234566");
        System.out.println("k1.naton : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }

    public void Car3example() {
        Car3 car1 = new Car3();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car3 car2 = new Car3("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car3 car3 = new Car3("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car3 car4 = new Car3("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);
        }


    public void Calculatorexample() {
            Calculator myCalc = new Calculator();

            myCalc.powerOn();

            int result1 = myCalc.plus(5, 6);
            System.out.println("result1: " + result1);

            int x = 10;
            int y = 4;

            double result2 = myCalc.divide(x, y);
            System.out.println("result2: " + result2);

            myCalc.powerOff();
        }

    public void Computerexample() {
            Computer myCom = new Computer();

            int result1 = myCom.sum(1, 2, 3);
            System.out.println("result1: " + result1);

            int result2 = myCom.sum(1, 2, 3, 4, 5);
            System.out.println("result2: " + result2);

            int[] values = { 1, 2, 3, 4, 5};
            int result3 = myCom.sum(values);
            System.out.println("result3: " + result3);

            int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
            System.out.println("result4: " + result4);
        }

    public void Car4example() {
        Car4 myCar = new Car4();

        myCar.setGas(5);

        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run();
        }

        System.out.println("gas를 주입하세요.");
    }

    public void Calculator2example() {
        Calculator2 myCalcu = new Calculator2();

        double result1 = myCalcu.areaRectangle(10);

        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이=" + result1);
        System.out.println("직사각형 넓이=" + result2);
    }

    public void SmartPhone() {
        SmartPhone myPh = new SmartPhone();

        System.out.println("폰 기종: " + myPh.name);
        System.out.println("폰 모델: " + myPh.model);
        System.out.println("폰 색깔: " + myPh.color);
        System.out.println("메모리 양: " + myPh.memories);
    }

    public void nintendo() {
        
    }
}
