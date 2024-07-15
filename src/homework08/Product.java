package homework08;
import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class Product implements Serializable {
    private String productName;
    private double cost;

    public Product() {
    }

    public Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getCost(), getCost()) == 0 && Objects.equals(getProductName(), product.getProductName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getCost());
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add(productName + " -")
                .add("Цена = " + cost)
                .toString()
                .replace(Product.class.getSimpleName(), "")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
    }
}
