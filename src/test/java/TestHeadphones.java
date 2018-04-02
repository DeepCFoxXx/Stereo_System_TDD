import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHeadphones {

    Headphones headphones;

    @Before
    public void before() {
        headphones = new Headphones("Sennheiser", "Headphones");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sennheiser", headphones.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Headphones", headphones.getModel());
    }

    @Test
    public void canOutput() {
        assertEquals("Playing Queen", headphones.outputSound("Queen"));
    }

}
