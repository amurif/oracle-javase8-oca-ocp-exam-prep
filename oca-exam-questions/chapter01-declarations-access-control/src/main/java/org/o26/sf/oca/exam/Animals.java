package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
public enum Animals {

    DOG("woof"), CAT("meow"), FISH("burble");

    String sound;

    Animals(String s) {
        sound = s;
    }
}
