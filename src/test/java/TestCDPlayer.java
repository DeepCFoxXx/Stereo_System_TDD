import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCDPlayer {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "Disc Player", 1);
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Disc Player", cdPlayer.getModel());
    }

    @Test
    public void canGetNumberOfCDs(){
        assertEquals(1, cdPlayer.getNumberOfCDs());
    }

}
