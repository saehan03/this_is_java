package com.mjc813.data;

import lombok.Getter;

@Getter

public class Human {
    private String name;
    private int age;
    private GameList<NintendoGame> gameList = new GameList<>();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.gameList = new GameList<>();
    }
}
