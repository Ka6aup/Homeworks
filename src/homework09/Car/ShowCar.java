package homework09.Car;
import java.util.Objects;
import java.util.StringJoiner;

public class ShowCar extends Car {
    private Integer stars;

    public ShowCar(String brand, String model, Integer manufactureYear, Integer power, Integer acceleration, Integer suspension, Integer durability) {
    }

    public ShowCar(String brand, String model, Integer manufactureYear, Integer power, Integer acceleration, Integer suspension, Integer durability, Integer stars) {
        super(brand, model, manufactureYear, power, acceleration, suspension, durability);
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowCar showCar)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(stars, showCar.stars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stars);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("brand='" + getBrand() + "'")
                .add("model='" + getModel() + "'")
                .add("manufactureYear=" + getManufactureYear())
                .add("power=" + getPower())
                .add("acceleration=" + getAcceleration())
                .add("suspension=" + getSuspension())
                .add("durability=" + getDurability())
                .add("stars=" + stars)
                .toString();
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
