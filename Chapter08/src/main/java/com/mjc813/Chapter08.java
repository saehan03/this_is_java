package com.mjc813;

public class Chapter08 {
    public void RemoteControlEx() {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();


        rc = new Audio();
        rc.turnOn();
    }

    public void RemoteControlEx2() {
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
    }

    public void RemoteControlEx3() {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
