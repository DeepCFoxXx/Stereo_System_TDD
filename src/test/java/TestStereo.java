import Components.CDPlayer;
import Components.Radio;
import Components.RecordPlayer;
import Stereo.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStereo {

    Stereo stereo;
    Radio radio;
    RecordPlayer recordPlayer;
    CDPlayer cdPlayer;

    @Before
    public void before() {
        radio = new Radio("Grundig", "Digitail");
        cdPlayer = new CDPlayer( "Sony", "Disc Player", 3);
        recordPlayer = new RecordPlayer("Pioneer", "Turntable");
        stereo = new Stereo("Deaf Machine", radio, recordPlayer, cdPlayer);
    }

    @Test
    public void canGetName() {
        assertEquals("Deaf Machine", stereo.getName());
    }

}
