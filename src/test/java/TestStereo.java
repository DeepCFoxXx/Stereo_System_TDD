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

    @Test
    public void volumeStartsAtZero() {
        assertEquals(0, stereo.getCurrentVolume());
    }

    @Test
    public void canTurnUpVolume() {
        stereo.turnItUp();
        assertEquals(1, stereo.getCurrentVolume());
    }

    @Test
    public void canTurnDown() {
        stereo.turnItUp();
        stereo.turnItUp();
        stereo.turnItDown();
        assertEquals(1, stereo.getCurrentVolume());
    }

    @Test
    public void cannotTurnSoundUpBeyondMax() {
        for (int i = 0; i < 20; i++) {
            stereo.turnItUp();
        }
        assertEquals(stereo.getMaxVolume(), stereo.getCurrentVolume());
    }

    @Test
    public void cannotTurnSoundDownBelowZero() {
        stereo.turnItUp();
        stereo.turnItUp();
        for (int i = 0; i < 20; i++) {
            stereo.turnItDown();
        }
        assertEquals(0, stereo.getCurrentVolume());
    }

    @Test
    public void canUseRadio() {
        String result = stereo.tuneRadio("Planet Rock");
        assertEquals("Radio Selected: Tuning to: Planet Rock",result);
    }

    @Test
    public void canUseCDPlayer() {
        String result = stereo.playCD("Cat scratch fever");
        assertEquals("CD - Playing: Cat scratch fever", result);
    }

    @Test
    public void canUseRecordPlayer() {
        String result = stereo.playRecord("Starman");
        assertEquals("Record Player - Playing: Starman", result);
    }


}
