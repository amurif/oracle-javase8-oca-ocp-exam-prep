package org.o26.sf.oca.exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by O26 on 24/02/2016.
 */
public class ChromeTest {

    private Chrome chrome;

    @Test
    public void testChromeClass() throws Exception {
        chrome.go();
    }

    @Before
    public void setUp() throws Exception {
        chrome = new Chrome();
    }

    @After
    public void tearDown() throws Exception {
        chrome = null;
    }
}