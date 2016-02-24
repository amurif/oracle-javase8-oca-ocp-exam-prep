package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
public class Tenor extends Singer {
    public static String sing() {
        return "fa";
    }

    public static void doSing() {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}

class Singer {
    public static String sing() {
        return "la";
    }
}