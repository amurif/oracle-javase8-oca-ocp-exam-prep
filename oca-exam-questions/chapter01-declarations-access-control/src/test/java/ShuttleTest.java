import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.o26.sf.oca.exam.Shuttle;

import static org.junit.Assert.*;

/**
 * Created by O26 on 24/02/2016.
 */
public class ShuttleTest {

    private Shuttle shuttle;

    @Test
    public void testShuffleClass() throws Exception {
        
    }

    @Before
    public void setUp() throws Exception {
        shuttle = new Shuttle();
    }

    @After
    public void tearDown() throws Exception {
        shuttle = null;
    }
}