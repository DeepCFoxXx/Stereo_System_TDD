public class RecordPlayer extends Component implements IPlay {

    public RecordPlayer(String make, String model) {
        super(make, model);
    }

    public String play(String title) {
        return "Record Player - Playing: " + title;
    }

}
