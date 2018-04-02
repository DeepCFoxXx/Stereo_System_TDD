import Components.RecordPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordPlayer {

    RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("Bang and Olufsen", "Turntable");
    }

    @Test
    public void canGetMake() {
        assertEquals("Bang and Olufsen", recordPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Turntable", recordPlayer.getModel());
    }

    @Test
    public void canPlay() {
        String result = recordPlayer.play("Kashmir");
        assertEquals("Record Player - Playing: Kashmir", result);
    }

}
