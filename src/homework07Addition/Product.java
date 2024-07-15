package homework07Addition;
import java.util.Objects;
import java.util.StringJoiner;

public class Product {
    private String productName;
    private double cost;
    private boolean childrenOn;

    public Product() {
    }

    public Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }
    public String getProductName() {
        return this.productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getCost() {
        return this.cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Product)) {
            return false;
        } else {
            Product product = (Product) o;
            return Double.compare(product.getCost(), this.getCost()) == 0 && Objects.equals(this.getProductName(), product.getProductName());
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.getProductName(), this.getCost()});
    }
    @Override
    public String toString() {
        return (new StringJoiner(", ", Product.class.getSimpleName() + "[", "]"))
                .add(this.productName + " -")
                .add("Цена = " + this.cost).toString().replace(Product.class.getSimpleName(), "")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
    }

}
