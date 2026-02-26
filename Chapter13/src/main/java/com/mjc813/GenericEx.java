package com.mjc813;

public class GenericEx {
    public static void main(String[] args) {
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
    }
//        public static <T extends Number> boolean compare(T t1, T t2) {
//            System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
//
//            double v1 = t1.doubleValue();
//            double v2 = t2.doubleValue();
//
//            return (v1 == v2);
//        }
//
//        public static void main (String[]args){
//            boolean result1 = compare(10, 20);
//            System.out.println(result1);
//            System.out.println();
//
//            boolean result2 = compare(4.5, 4.5);
//            System.out.println(result2);
//        }
//        Box<String> box1 = new Box<>();
//        box1.content = "안녕하세요.";
//        String str = box1.content;
//        System.out.println(str);
//
//        Box<Integer> box2 = new Box<>();
//        box2.content = 100;
//        int value = box2.content;
//        System.out.println(value);

//        Product<Tv, String> product1 = new Product();
//
//        product1.setKind(new Tv());
//        product1.setModel("스마트Tv");
//
//        Tv tv = product1.getKind();
//        String tvModel = product1.getModel();
//
//        Product<Car, String> product2 = new Product<>();
//
//        product2.setKind(new Car());
//        product2.setModel("SUV자동차");
//
//        Car car = product2.getKind();
//        String carModel = product2.getModel();

//        HomeAgency homeAgency = new HomeAgency();
//        Home home = homeAgency.rent();
//        home.turnOnLight();
//
//        CarAgency carAgency = new CarAgency();
//        Car car = carAgency.rent();
//        car.run();

//        Box<String> box1 = new Box<>0;
//        box1.content = "100";
//
//        Box<String> box2 = new Box<>0;
//        box2.content = "100";

//        boolean result1 = box1.compare(box2);
//        System.out.println("result1: " + result1);
    }
