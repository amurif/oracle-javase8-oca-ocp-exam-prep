package org.o26.sf.oca.exam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by O26 on 24/02/2016.
 */
public class ClidletTest {

    private Clidlet clidlet;

    @Test
    public void testClidletClass() throws Exception {
        clidlet.flipper();
    }

    @Before
    public void setUp() throws Exception {
        clidlet = new Clidlet();
    }

    @After
    public void tearDown() throws Exception {
        clidlet = null;
    }
}