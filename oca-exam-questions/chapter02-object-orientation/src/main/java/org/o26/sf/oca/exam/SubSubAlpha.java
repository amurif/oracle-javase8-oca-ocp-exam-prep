package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Alpha {
    static String s = " ";

    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}

public class SubSubAlpha extends Alpha {
    private SubSubAlpha() {
        s += "subsub ";
    }

    public static void go() {
        new SubSubAlpha();
        System.out.println(s);
    }
}