package homework07Addition;
import java.util.Iterator;
import java.util.List;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Хлеб", 40.0),
                new Product("Молоко", 60.0),
                new DiscountProduct("Торт", 800.0, 15.0),
                new DiscountProduct("Кофе растворимый", 432.0, 50.0),
                new Product("Мороженное", 200.0),
                new Product("Макароны", 800.0));
        System.out.println("Список продуктов с ценами :");
        Iterator productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product productList = (Product) productIterator.next();
            System.out.println(productList);
        }

        List<Person> newPerson = List.of(new Children("Анна", 2000.0, 5),
                new OldMan("Борис", 1000.0, 66),
                new Man("Женя", 500.0, 35,5000));
        System.out.println("Список покупателей : ");
        Iterator personIterator = newPerson.iterator();

        Person personList;
        while (personIterator.hasNext()) {
            personList = (Person) personIterator.next();
            System.out.println(personList);
        }

        personIterator = newPerson.iterator();

        while (true) {
            while (personIterator.hasNext()) {
                personList = (Person) personIterator.next();
                System.out.println("Покупает: " + personList.getName());
                if (personList.getCash() < 0.0) {
                    System.out.println("Отрицательное число денег");
                } else if (personList.getCash() == 0.0) {
                    System.out.println("Нет денег");
                } else {
                    try {
                        for (int i = 0; i < 3; ++i) {
                            Product product = (Product) products.get((int) (Math.random() * (double) products.size()));
                            personList.byuProduct(product);
                            System.out.println("Купил: " + product.getProductName());
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            return;
        }
    }
}
