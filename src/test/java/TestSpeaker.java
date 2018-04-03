import Outputs.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSpeaker {

    Speaker speaker;

    @Before
    public void before() {
        speaker = new Speaker(9000);
    }

    @Test
    public void canGetMaxOutput() {
        assertEquals(9000, speaker.getMaxOutput());
    }

    @Test
    public void canOutPutSound() {
        assertEquals("Playing Queen", speaker.outputSound("Queen"));
    }

}
