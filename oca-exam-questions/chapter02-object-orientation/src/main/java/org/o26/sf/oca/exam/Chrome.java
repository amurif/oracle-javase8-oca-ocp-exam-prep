package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class X {
    void do1() {
    }
}

class Y extends X {
    void do2() {
    }
}

public class Chrome {
    public void go() {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // insert code here
        // x2.do2() // will not compile!
        // (Y)x2.do2() // will not compile!
        ((Y)x2).do2(); // will compile!
    }
}