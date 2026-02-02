package com.mjc813;

import java.time.LocalDate;
import java.time.LocalTime;

public class Hospital {

    private String name;
    private AnimalType type;
    private String id;
    private LocalDate admissionDate;
    private Doctor doctor;
    private LocalDate dischargeDate;
    private Owner owner;
    private int visitCount;

    public Hospital (String name, AnimalType type, String id,
                              LocalDate admissionDate, Doctor doctor, Owner owner) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.admissionDate = admissionDate;
        this.doctor = doctor;
        this.owner = owner;
        this.visitCount = 0;
    }

    public boolean visit(Owner visitor, LocalTime time) {

        if (!visitor.equals(owner)) {
            System.out.println("주인만 면회 가능합니다.");
            return false;
        }

        if (time.getHour() < 15 || time.getHour() > 20) {
            System.out.println("면회 가능 시간은 15시~20시입니다.");
            return false;
        }
        if (visitCount >= 1) {
            System.out.println("하루 1번만 면회 가능합니다.");
            return false;
        }

        visitCount++;
        System.out.println("면회가 완료되었습니다.");
        return true;

    }
}
