package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
class Top {

    public Top() {
        // default no-arg constructor must be provided
    }
    public Top(String aString) {
        System.out.print(aString);
    }
}

public class Bottom2 extends Top {
    private String aString;

    public Bottom2(String aString) {
        super();// explicitly add a call to super()
        this.aString = aString;
    }
    public void sayHello(){
        System.out.print(aString);
    }
}
