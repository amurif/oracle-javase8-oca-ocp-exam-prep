package org.o26.sf.oca.exam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by O26 on 24/02/2016.
 */
public class Bottom2Test {

    private Bottom2 bottom2;

    @Test
    public void testButtom2Class() throws Exception {
        bottom2.sayHello();
        System.out.println(" ");
    }

    @Before
    public void setUp() throws Exception {
        bottom2 = new Bottom2("Hello, world!");
    }

    @After
    public void tearDown() throws Exception {
        bottom2 = null;
    }
}