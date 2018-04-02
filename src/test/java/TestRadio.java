import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "Digital");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Digital", radio.getModel());
    }

}
