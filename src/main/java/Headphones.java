public class Headphones implements IOutput {

    private String make;
    private String model;

    public Headphones(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String outputSound(String sound) {
        return "Playing " + sound;
    }

    public String getMake() {
        return this.make;
    }
}
