package org.o26.sf.oca.exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by O26 on 24/02/2016.
 */
public class DogShowTest {

    private DogShow dogShow;

    @Test
    public void testDogShowClass() throws Exception {
        dogShow.go();
    }

    @Before
    public void setUp() throws Exception {
        dogShow = new DogShow();
    }

    @After
    public void tearDown() throws Exception {
        dogShow = null;
    }
}