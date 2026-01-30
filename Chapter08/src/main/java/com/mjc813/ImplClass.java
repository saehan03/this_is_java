package com.mjc813;

import javax.swing.plaf.synth.SynthUI;

public class ImplClass implements InterfaceC {
    public void methodA() {
        System.out.println("methodA() 실행");
    }

    public void methodB() {
        System.out.println("methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("methodC() 실행");
    }
}
