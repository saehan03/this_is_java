package com.mjc813;

import com.mjc813.crud.CrudCls;
import com.mjc813.crud.Grade;
import com.mjc813.crud.NintendoGame;
import com.mjc813.packaging.MainPackaging;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySchool mjc813 = new MySchool();

        mjc813.getElementClass().add(new MyElementStudent("병아리1", 8, "김병아리"));
        mjc813.getElementClass().add(new MyElementStudent("병아리2", 9, "이병아리"));

        mjc813.getMiddleClass().add(new MyMiddleStudent("김사랑", 15, "국어1야간반"));
        mjc813.getMiddleClass().add(new MyMiddleStudent("이말자", 15, "수학1야간반"));

        mjc813.getStringClass().add("홍길동");
        mjc813.getStringClass().add("이순신");

        mjc813.getElementClass().printAll();
        mjc813.getMiddleClass().printAll();
        mjc813.getStringClass().printAll();
        MainPackaging mp = new MainPackaging();
        mp.doSome();

        NintendoGame ng = new NintendoGame("포켓몬스터", Grade.ALL, 60000);
        System.out.println(ng);
    }

    public static void printList(List<?> list) { // 어떤 List든 수용 가능
        for (Object item : list) {
            System.out.println(item);
        }
    }
}