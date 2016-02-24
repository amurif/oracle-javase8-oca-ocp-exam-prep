package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.print("sniff ");
    }

    public void bark() {
        System.out.print("howl ");
    }
}

public class DogShow {
    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark(); // Explicit (redundant) cast (upcasting)
        // ((Dog) new Hound()).sniff(); // will not compile Dog doesn't have sniff() method
    }
}
