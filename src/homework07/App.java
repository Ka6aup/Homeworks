package homework07;

public class App {
    public static void main(String[] args) {

        Product[] products = new Product[7];
        products[0] = new Product("Хлеб", 40);
        products[1] = new Product("Молоко", 60);
        products[2] = new Product("888", 78);
        products[3] = new Product("ен", 78);
        products[4] = new Product("Шоколадка", 0);
        products[5] = new Product("Торт", 800);
        products[6] = new Product("Кофе растворимый", 432);
        System.out.println("Список продуктов с ценами :");
        for (Product newProduct : products) {
            try {
                System.out.println(newProduct.getProductName() + "=" + newProduct.getCost());
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        }

        DiscountProduct[] discProduct = new DiscountProduct[2];
        discProduct[0] = new DiscountProduct("Торт", 800, 15);
        discProduct[1] = new DiscountProduct("Кофе растворимый", 432, 50);

        System.out.println("Список продуктов со скидкой :");

        for (DiscountProduct newDiscproduct : discProduct) {
            if (newDiscproduct.checkDiscount()) {
                System.out.println(newDiscproduct);
            }
        }
    }
}
