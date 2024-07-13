package homework06;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String name;
    private double money;
    private Product[] products = new Product[10];

    public Person() {
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public Product[] getProducts() {
        return products;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Double.compare(person.getMoney(), getMoney()) == 0 && Objects.equals(getName(), person.getName());
    }
    public int hashCode() {
        return Objects.hash(getName(), getMoney());
    }
    public String toString() {
        return new StringJoiner(", ", "", "")
                .add("Имя  '" + name + "'")
                .add("Деньги = " + money)
                .toString();
    }
    public void byuProduct(Product product) {
        if (product.getPrice() > money) {
            throw new RuntimeException("Не хватает денег");
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }
}
