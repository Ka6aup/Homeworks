package homework06;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Product {
    private String productName;
    private double price;

    public Product() {
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getProductName(), product.getProductName());
    }
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice());
    }
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add(productName + " -")
                .add("Цена = " + price)
                .toString()
                .replace(Product.class.getSimpleName(), "")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
    }
}
