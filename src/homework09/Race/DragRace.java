package homework09.Race;
import java.util.StringJoiner;

public class DragRace extends Race {
    public DragRace() {
    }

    public DragRace(String type, Integer distance, String route, Integer prizeFound) {
        super(type, distance, route, prizeFound);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DragRace.class.getSimpleName() + "[", "]")
                .toString();
    }
}
