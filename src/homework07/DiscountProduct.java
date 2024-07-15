package homework07;
import java.time.LocalDate;
import java.util.StringJoiner;

class DiscountProduct extends Product {
    private double discountPercentage;
    private double discountCost;
    public LocalDate discountCostDate = LocalDate.now();

    public DiscountProduct(String productName, double cost, double discountPercentage) {
        super(productName, cost);
        this.discountPercentage = discountPercentage;
        this.discountCost = Math.round(getCost() - (getCost() * getDiscountPercentage() / 100));
        this.discountCostDate = discountCostDate.plusDays(2);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {

        this.discountPercentage = discountPercentage;
    }

    public double getDiscountCost() {
        return discountCost;
    }

    public void setDiscountCost(double discountCost) {

        this.discountCost = discountCost;
    }

    public LocalDate getDiscountCostLast() {
        return discountCostDate;
    }

    public void setDiscountCostLast(LocalDate discountCostLast) {
        this.discountCostDate = discountCostLast;
    }

    @Override
    public String toString() {
        return new StringJoiner(" ", "" + "", "")
                .add(getProductName() + " -")
                .add("Скидка в % = " + discountPercentage)
                .add("Цена со скидкой = " + discountCost)
                .add("Скидка длиться до = " + discountCostDate)
                .toString();
    }

    public boolean checkDiscount() {
        return discountCostDate.isAfter(LocalDate.now());
    }
}
