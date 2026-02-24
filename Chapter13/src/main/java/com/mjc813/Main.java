package com.mjc813;

import com.mjc813.packaging.MainPackaging;
import com.mjc813.crud.CrudCls;
import com.mjc813.crud.NintendoGame;
import com.mjc813.crud.CRUD;
import com.mjc813.crud.Grade;

public class Main {
    public static void main(String[] args) {
        CRUD<NintendoGame> nintendoList = new CrudCls<>();

        nintendoList.add(new NintendoGame("마리오 카트 8", Grade.ALL, 64800));
        nintendoList.add(new NintendoGame("젤다의 전설", Grade.TWELVE, 74800));
        nintendoList.add(new NintendoGame("베요네타 3", Grade.ADULT, 64800));

        System.out.println("단일 항목: " + nintendoList.getJson(0));

        nintendoList.set(1, new NintendoGame("젤다 왕눈", Grade.TWELVE, 79800));

//        nintendoList.remove(2);
        
        System.out.println("\n전체 목록 JSON:");
        System.out.println(nintendoList.getJsonAllItems());
    }
//        MySchool mjc813 = new MySchool();
//
//        mjc813.getElementClass().add( new MyElementStudent("병아리1", 8, "김병아리"));
//        mjc813.getElementClass().add( new MyElementStudent("병아리2", 9, "이병아리"));
//
//        mjc813.getMiddleClass().add(new MyMiddleStudent("김사랑", 15, "국어1야간반"));
//        mjc813.getMiddleClass().add(new MyMiddleStudent("이말자", 15, "수학1야간반"));
//
//        mjc813.getStringClass().add("홍길동");
//        mjc813.getStringClass().add("이순신");
//
//        mjc813.getElementClass().printAll();
//        mjc813.getMiddleClass().printAll();
//        mjc813.getStringClass().printAll();
        MainPackaging mp = new MainPackaging();
//        mp.doSome();
    }