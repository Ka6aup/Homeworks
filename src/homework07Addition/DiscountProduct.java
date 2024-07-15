package homework07Addition;

import java.time.LocalDate;
import java.util.StringJoiner;

public class DiscountProduct extends Product {
    private double discountPercentage;
    private double discountCost;
    public LocalDate discountCostDate = LocalDate.now();

    public DiscountProduct() {
    }

    public DiscountProduct(String productName, double cost, double discountPercentage) {
        super(productName, cost);
        this.discountPercentage = discountPercentage;
        this.discountCost = (double) Math.round(this.getCost() - this.getCost() * this.getDiscountPercentage() / 100.0);
        this.discountCostDate = this.discountCostDate.plusDays(20L);
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountCost(int age) {
        if (age >= 65) {
            throw new RuntimeException("Купил с дополнительной скидкой 5%: " + this.getProductName());
        } else {
            return this.discountCost;
        }
    }

    public void setDiscountCost(double discountCost) {
        this.discountCost = discountCost;
    }

    public LocalDate getDiscountCostLast() {
        return this.discountCostDate;
    }

    public void setDiscountCostLast(LocalDate discountCostLast) {
        this.discountCostDate = discountCostLast;
    }

    @Override
    public String toString() {
        return (new StringJoiner(" ", "", ""))
                .add(this.getProductName() + " -")
                .add("Скидка в % = " + this.discountPercentage)
                .add("Цена со скидкой = " + this.discountCost)
                .add("Скидка длиться до = " + this.discountCostDate).toString();
    }
}
