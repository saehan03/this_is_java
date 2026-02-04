package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Casher casher = new Casher();
//        try {
            casher.calculMoney();
//        }   catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        }
        System.out.println("finish execute !");
    }
}