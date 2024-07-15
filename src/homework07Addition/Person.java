package homework07Addition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private String name;
    private double cash;
    private final List<Product> products = new ArrayList();
    private int age;

    public Person() {
    }

    public Person(String name, double cash, int age) {
        this.name = name;
        this.cash = cash;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return this.cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            Person person = (Person) o;
            return Double.compare(person.getCash(), this.getCash()) == 0 && Objects.equals(this.getName(), person.getName());
        }
    }
    @Override

    public int hashCode() {
        return Objects.hash(new Object[]{this.getName(), this.getCash()});
    }
    @Override
    public String toString() {
        return (new StringJoiner(", ", "", "")).add("Имя  '" + this.name + "'").add("Деньги = " + this.cash).toString();
    }

    public void byuProduct(Product product) {
        if (this.age < 6) {
            throw new IllegalArgumentException("Ограничение по возрасту: " + this.age);
        } else if (product.getCost() > this.cash && !(this instanceof Man)) {
            throw new IllegalArgumentException("Нехватает денег: " + product.getProductName());
        } else if (product.getCost() > this.cash && this instanceof Man man) {
            man.setCreditLine(man.getCreditLine() - product.getCost());
            throw new IllegalArgumentException("Взял в кредит: " + product.getProductName() + "Осталось кредитных денег " + man.getCreditLine());
        } else if (product instanceof DiscountProduct) {
            DiscountProduct discountProduct = (DiscountProduct) product;
            this.cash -= discountProduct.getDiscountCost(this.age);
            throw new IllegalArgumentException("Купил со скидкой: " + product.getProductName());
        } else {
            this.cash -= product.getCost();
            this.products.add(product);
        }
    }
}
