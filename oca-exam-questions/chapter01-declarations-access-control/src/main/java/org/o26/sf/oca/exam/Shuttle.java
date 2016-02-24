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
    public void go() {
        blastOff();
        //Rocket.blastOff(); // line A
        // Error:(15, 15) java: blastOff() has private access in org.o26.sf.oca.exam.Rocket
    }

    private void blastOff() {
        System.out.print("sh-bang ");
    }
}
