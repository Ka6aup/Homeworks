package homework07Addition;

import java.util.Date;
import java.util.Objects;

public class DiscountProduct extends Product {
    private int discount;
    private Date discountExpirationDate = new Date(2012,10,13);
    protected Date currentDate = new Date();

    public DiscountProduct() {
    }
    public DiscountProduct(String productName, int price, int discount, boolean isKidAvailable) {
        super(productName, price, isKidAvailable);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
    @Override
    public int getPrice(){
        int cost = 0;
        if(currentDate.compareTo(discountExpirationDate) <=0) {
            double price = this.price - (this.price / 100 * discount);
            cost = (int)price;
        }
        return cost;
    }

    @Override
    public boolean isDiscountProduct() {
        return super.isDiscountProduct = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountProduct that = (DiscountProduct) o;
        return discount == that.discount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
    @Override
    public String toString() {
        return super.getProductName() + "(" + getPrice() + "р " + this.discount + "%)";
    }
}
