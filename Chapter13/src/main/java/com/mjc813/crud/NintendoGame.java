package com.mjc813.crud;

public class NintendoGame {
    private String name;
    private Grade grade;
    private Integer price;

    public NintendoGame(String name, Grade grade, Integer price) {
        this.name = name;
        this.grade = grade;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name=%s, grade=%s, price=%d", name, grade, price);
    }
}
