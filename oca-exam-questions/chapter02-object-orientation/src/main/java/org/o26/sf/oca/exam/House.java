package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Building {
    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}

public class House extends Building {
    House() {
        System.out.print("h ");
    }

    House(String name) {
        this();
        System.out.print("hn " + name);
    }

    public static void go() {
        new House("x ");
    }
}
