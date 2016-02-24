package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Clidder {
    //public    final void flipper() {
    //protected final void flipper() {
    //          final void flipper() {
    // The three alternatives above wan't compile!
    // final method cannot be overriden!
    private final void flipper() {
        // This version will compile!
        // private access modifier hide the method so that
        // it will not be accessible for inheritance!
        System.out.println("Clidder");
    }
}

public class Clidlet extends Clidder {
    public final void flipper() {
        // This is just a new local version of flipper method.
        // not an overriden version!
        System.out.println("Clidlet");
    }
}