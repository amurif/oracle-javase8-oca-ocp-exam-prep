package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Rocket {
    private void blastOff() {
        System.out.print("bang ");
    }
}

public class Shuttle extends Rocket {
    public static void main(String[] args) {
        new Shuttle().go();
    }

    void go() {
        blastOff();
// Rocket.blastOff(); // line A
    }

    private void blastOff() {
        System.out.print("sh-bang ");
    }
}
