package org.o26.sf.oca.exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by O26 on 24/02/2016.
 */
public class RedwoodTest {

    private Redwood redwood;

    @Test(expected = ClassCastException.class)
    public void testRedwoodClass() throws Exception {
        redwood.go();
    }

    @Before
    public void setUp() throws Exception {
        redwood = new Redwood();
    }

    @After
    public void tearDown() throws Exception {

    }
}