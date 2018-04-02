public class CDPlayer extends Component{

    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs) {
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }
}
