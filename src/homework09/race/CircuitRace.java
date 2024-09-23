package homework09.race;
import java.util.Objects;
import java.util.StringJoiner;

public class CircuitRace extends Race {
    private Integer laps;

    public CircuitRace() {
    }

    public CircuitRace(String type, Integer distance, String route, Integer prizeFound, Integer laps) {
        super(type, distance, route, prizeFound);
        this.laps = laps;
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CircuitRace that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getLaps(), that.getLaps());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLaps());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CircuitRace.class.getSimpleName() + "[", "]")
                .add("laps=" + laps)
                .toString();
    }
}
