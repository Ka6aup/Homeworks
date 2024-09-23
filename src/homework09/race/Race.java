package homework09.race;
import homework09.car.Car;

import java.util.*;

public class Race {
    private String type;
    private Integer distance;
    private String route;
    private Integer prizeFound;
    private final List<Car> cars = new ArrayList<>();

    public Race() {
    }

    public Race(String type, Integer distance, String route, Integer prizeFound) {
        this.type = type;
        this.distance = distance;
        this.route = route;
        this.prizeFound = prizeFound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getPrizeFound() {
        return prizeFound;
    }

    public void setPrizeFound(Integer prizeFound) {
        this.prizeFound = prizeFound;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race race)) return false;
        return Objects.equals(getType(), race.getType()) && Objects.equals(getDistance(), race.getDistance()) && Objects.equals(getRoute(), race.getRoute()) && Objects.equals(getPrizeFound(), race.getPrizeFound()) && Objects.equals(getCars(), race.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getDistance(), getRoute(), getPrizeFound(), getCars());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Race.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .add("distance=" + distance)
                .add("route='" + route + "'")
                .add("prizeFound=" + prizeFound)
                .add("cars=" + cars)
                .toString();
    }
}
