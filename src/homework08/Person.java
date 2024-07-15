package homework08;
import java.io.Serializable;
import java.util.*;

public class Person implements Serializable {
    private String name;
    private double cash;
    private final List<Product> products = new ArrayList<>();

    public Person() {
    }

    public Person(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public List<Product> getProducts() {
        return products;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Double.compare(person.getCash(), getCash()) == 0 && Objects.equals(getName(), person.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCash());
    }
    @Override
    public String toString() {
        return new StringJoiner(", ",   "[", "]")
                .add("" + name + "'")
                .add("" + cash)
                .add("" + products)
                .toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace("'", "")
                .trim();


    }
    public void byuProduct(Product product) {
        if (product.getCost() > cash) {
            throw new RuntimeException("Нехватает денег");
        }
        products.add(product);
    }
}
