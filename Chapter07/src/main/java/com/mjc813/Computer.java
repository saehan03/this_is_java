package com.mjc813;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areCircle() 실행");
        return Math.PI * r * r;
    }
}
