package com.mjc813;

import com.mjc813.machine.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        long n = cal.add(1, 2, 3, 7, 9);
        System.out.println("n = " + n);
        }
    }