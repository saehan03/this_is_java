package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Chapter03 tt = new Chapter03();
        tt.Third01();

        Chapter03 aa = new Chapter03();
        aa.Third02();

        Chapter03 bb = new Chapter03();
        bb.Third03();

        Chapter03 cc = new Chapter03();
        cc.Third04();

        EquationEx dd = new EquationEx();
        System.out.println("2x + 8 = 0 의 해, x는 " + dd.equationFirst(2, 8));
        System.out.println("5x - 30 = 0 의 해, x는 " + dd.equationFirst(5, -30));
        System.out.println("7x + 49 = 0 의 해, x는 " + dd.equationFirst(7, 49));

        Chapter03 ff = new Chapter03();
        ff.practice();

        Chapter03 gg = new Chapter03();
        gg.Third06();

        Chapter03 hh = new Chapter03();
        hh.Third07();

        Chapter03 ii = new Chapter03();
        ii.Third08();

        Chapter03 jj = new Chapter03();
        jj.Third09();

        Chapter03 kk = new Chapter03();
        kk.Third09_1();

        Chapter03 ll = new Chapter03();
        ll.Third10();

        Chapter03 mm = new Chapter03();
        mm.Third11();

        Chapter04 nn = new Chapter04();
        nn.Practice();
    }
}