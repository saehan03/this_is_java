package com.mjc813;

import com.google.gson.Gson;

public class Gson {
    public void runTestGson() {
        Gson gs25 = new Gson();
        int[] intArray = {1, 2, 3, 4, 5, 6};
        String s1 = gs25.toJson(intArray);
        System.out.println(s1);

        MyClass mc = new MyClass();
        mc.setMyArray(intArray);
        String s2 = gs25.toJson(mc);
        System.out.println(s2);
    }
}
