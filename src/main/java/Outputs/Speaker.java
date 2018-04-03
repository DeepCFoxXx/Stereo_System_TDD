package Outputs;

public class Speaker implements IOutput {

    private int maxOutput;

    public Speaker(int maxOutput) {
        this.maxOutput = maxOutput;
    }

    public int getMaxOutput() {
        return this.maxOutput;
    }

    public String outputSound(String sound) {
        return "Playing " + sound;
    }
}
