package com.mjc813;

import com.mjc813.data.*;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        SampleOutputStream();
        Human lsh = new Human("이순신", 19);
        lsh.getGameList().add(new NintendoGame("마리오카트", 50000, Grade.All, GameType.Arcade));
        lsh.getGameList().add(new NintendoGame("젤다의전설", 35000, Grade.Age12, GameType.RPG));
        lsh.getGameList().add(new NintendoGame("마리오오디세이", 70000, Grade.All, GameType.Actiion));
    }

    public static void SampleOutputStream() {
        try {
            OutputStream os = new FileOutputStream("./test.txt");
            os.write(10);
            os.write(20);
            os.write(30);
            os.flush();
            os.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }
    }
}