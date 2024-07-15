package homework09.Car;
import java.util.Objects;
import java.util.StringJoiner;

public class Car {
    private String brand;
    private String model;
    private Integer manufactureYear;
    private Integer power;
    private Integer acceleration;
    private Integer suspension;
    private Integer durability;


    public Car() {
    }

    public Car(String brand, String model, Integer manufactureYear, Integer power, Integer acceleration, Integer suspension, Integer durability) {
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.power = power;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(manufactureYear, car.manufactureYear) && Objects.equals(power, car.power) && Objects.equals(acceleration, car.acceleration) && Objects.equals(suspension, car.suspension) && Objects.equals(durability, car.durability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, manufactureYear, power, acceleration, suspension, durability);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("brand='" + brand + "'")
                .add("model='" + model + "'")
                .add("manufactureYear=" + manufactureYear)
                .add("power=" + power)
                .add("acceleration=" + acceleration)
                .add("suspension=" + suspension)
                .add("durability=" + durability)
                .toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Integer acceleration) {
        this.acceleration = acceleration;
    }

    public Integer getSuspension() {
        return suspension;
    }

    public void setSuspension(Integer suspension) {
        this.suspension = suspension;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }
}
