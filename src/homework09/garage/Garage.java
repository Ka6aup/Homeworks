package homework09.garage;
import homework09.car.Car;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Garage {
    private final List<Car> parkedCars;

    public Garage(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }


    public void addCarToGarage(Car car) {
        parkedCars.add(car);
    }

    public void modifyCarDurability(Car car) {
        Car carModel = parkedCars.get(parkedCars.indexOf(car));
        if (carModel == null) return;
        carModel.setDurability(carModel.getDurability() * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage garage)) return false;
        return Objects.equals(parkedCars, garage.parkedCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkedCars);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Garage.class.getSimpleName() + "[", "]")
                .add("parkedCars=" + parkedCars)
                .toString();
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }
}
