package homework09.Race;
import java.util.StringJoiner;

public class CasualRace extends Race {
    public CasualRace() {
    }

    public CasualRace(String type, Integer distance, String route, Integer prizeFound) {
        super(type, distance, route, prizeFound);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CasualRace.class.getSimpleName() + "[", "]")
                .toString();
    }
}
