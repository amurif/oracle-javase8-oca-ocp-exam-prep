package org.o26.sf.oca.exam;

/**
 * Created by O26 on 24/02/2016.
 */
public class Redwood extends Tree {

    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());// Tree cannot be cast to Redwood

    }

    void go2(Tree t1, Redwood r1) {
        // t1 (doesn't reference a Redwood) cannot be cast to Redwood
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tree {
}