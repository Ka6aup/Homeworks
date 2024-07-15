package homework07;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Product {
    private String productName;
    private double cost;

    public Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }

    public String getProductName() {
        if (productName == null || productName.isEmpty()) {
            throw new RuntimeException(productName + "   Недопустимое имя продукта");
        } else if (productName.length() < 3) {
            throw new RuntimeException(productName + "  Недопустимое имя продукта");
        } else if (!Pattern.matches("[а-яА-я\s]+", productName)) {
            throw new RuntimeException(productName + "  Недопустимое имя продукта");
        }
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        if (cost <= 0) {
            throw new RuntimeException(productName + "  " + cost + "   Недопустимая стомость продукта");
        }
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
