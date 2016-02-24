package org.o26.sf.oca.exam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by O26 on 24/02/2016.
 */
public class _Test {

    private _ instance;

    @Test
    public void testDoLoop() throws Exception {
        instance.doLoop();
    }

    @Before
    public void setUp() throws Exception {
        String[] parameter = {"-"," ","A"," ","."};
        instance = new _(parameter);
    }

    @After
    public void tearDown() throws Exception {

    }
}