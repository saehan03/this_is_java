package com.mjc813;

public class Chapter07 {

    public void SmartPhoneEx() {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }

    public void ComputerEx() {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));
    }

    public void SupersonicAirplaneEx() {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }

    public void ChildEx() {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
    }

//    public void achievement() {
//        Subject sj = new Subject();
//
//        Student st = sj;
//
//    }


    public void CarEx() {
        Car myCar = new Car();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }

    public void DriverEx() {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }

//    public void InstanceofEx() {
//        public static void personInfo(Person person) {
//            System.out.println("name: " + person.name);
//            person.walk();
//
//            if (person instanceof Student01 student) {
//                System.out.println("studentNo: " + student.studentNo);
//                student.study();
//            }
//        }
//        public static void () {
//            Person p1 = new Person("홍길동");
//            personInfo(p1);
//
//            System.out.println();
//
//            Person p2 = new Student01("김길동", 10);
//            personInfo(p2);
//        }
//    }


}
