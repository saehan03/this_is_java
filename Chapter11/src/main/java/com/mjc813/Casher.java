package com.mjc813;

public class Casher {
    public void calculMoney(int ... arrs) {
        Calculator cal = new Calculator();
        double res = cal.divide(arrs);
        System.out.println("res = " + res);
    }
}