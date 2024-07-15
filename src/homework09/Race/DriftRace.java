package homework09.Race;
import java.util.StringJoiner;

public class DriftRace extends Race {
    public DriftRace() {
    }

    public DriftRace(String type, Integer distance, String route, Integer prizeFound) {
        super(type, distance, route, prizeFound);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DriftRace.class.getSimpleName() + "[", "]")
                .toString();
    }
}
