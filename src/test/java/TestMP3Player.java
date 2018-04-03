import Components.CDPlayer;
import Components.Radio;
import Components.RecordPlayer;
import Stereo.MP3Player;
import Stereo.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMP3Player {

    MP3Player mp3Player;
    Stereo stereo;
    Radio radio;
    RecordPlayer recordPlayer;
    CDPlayer cdPlayer;

    @Before
    public void before() {
        radio = new Radio("Philips", "Digital");
        cdPlayer = new CDPlayer("Sony", "Disc Player", 3);
        recordPlayer = new RecordPlayer("Grundig", "Turntable");
        stereo = new Stereo("Deaf Machine", radio, recordPlayer, cdPlayer);
        mp3Player = new MP3Player("Apple", "Ipod");
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", mp3Player.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Ipod", mp3Player.getModel());
    }


}
