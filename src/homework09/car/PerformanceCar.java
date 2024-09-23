package homework09.car;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringJoiner;

public class PerformanceCar extends Car {
    private final ArrayList<String> addOns = new ArrayList<>();

    public PerformanceCar() {
    }

    public PerformanceCar(String brand, String model, Integer manufactureYear, Integer power, Integer acceleration, Integer suspension, Integer durability) {
        super(brand, model, manufactureYear, power, acceleration, suspension, durability);
        this.setPower(getPower() / 100 * 150);
        this.setSuspension((int) ((double) getSuspension() / 100d * 75));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PerformanceCar that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), addOns);
    }

    public ArrayList<String> getAddOns() {
        return addOns;
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
                .add("addOns=" + addOns)
                .toString();
    }
}
