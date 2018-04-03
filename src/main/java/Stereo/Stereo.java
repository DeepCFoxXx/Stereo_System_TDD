package Stereo;

import Components.CDPlayer;
import Components.Radio;
import Components.RecordPlayer;

public class Stereo {

    private String name;
    private Radio radio;
    private RecordPlayer recordPlayer;
    private CDPlayer cdPlayer;
    private int currentVolume;
    private int maxVolume;

    public Stereo(String name, Radio radio, RecordPlayer recordPlayer, CDPlayer cdPlayer) {
        this.name = name;
        this.radio = radio;
        this.recordPlayer = recordPlayer;
        this.cdPlayer = cdPlayer;
        this.currentVolume = 0;
        this.maxVolume = 11;
    }

    public String getName() {
        return name;
    }

}
