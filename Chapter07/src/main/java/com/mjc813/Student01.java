package com.mjc813;

public class Student01 extends Person {
    public int studentNo;

    public Student01(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }
}
