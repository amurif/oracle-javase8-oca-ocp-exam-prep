package org.o26.sf.oca.exam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by O26 on 24/02/2016.
 */
public class AnimalsTest {

    private static Animals animals;

    @Test
    public void testEnum() throws Exception {
        assertEquals("woof",animals.DOG.sound);
        assertEquals("burble",animals.FISH.sound);
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}