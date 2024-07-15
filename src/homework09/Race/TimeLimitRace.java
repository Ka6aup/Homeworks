package homework09.Race;
import java.util.Objects;
import java.util.StringJoiner;

public class TimeLimitRace extends Race {
    private Integer goldTime;

    public TimeLimitRace() {
    }

    public TimeLimitRace(String type, Integer distance, String route, Integer prizeFound, Integer goldTime) {
        super(type, distance, route, prizeFound);
        this.goldTime = goldTime;
    }

    public Integer getGoldTime() {
        return goldTime;
    }

    public void setGoldTime(Integer goldTime) {
        this.goldTime = goldTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeLimitRace that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getGoldTime(), that.getGoldTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGoldTime());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TimeLimitRace.class.getSimpleName() + "[", "]")
                .add("goldTime=" + goldTime)
                .toString();
    }
}
