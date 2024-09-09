package homework07Addition;

import java.util.*;


public class App {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 80, true);
        Product bread = new Product("Хлеб", 50, true);
        Product beer = new Product("Пиво", 200, false);
        Product chiken = new Product("Курица", 250, true);
        Product fish = new Product("Рыба", 500, true);
        //Product product = new Product(getProductNameFromScaner(), getProductPriceFromScanner(), productAvailableForKids());
        DiscountProduct sugar = new DiscountProduct("Сахар", 100, 10, true);
        DiscountProduct coffee = new DiscountProduct("Кофе", 150, 20, true);
        DiscountProduct vegetables = new DiscountProduct("Овощи", 200, 15, true);
        //DiscountProduct discountProduct = new DiscountProduct(getProductNameFromScaner(), getProductPriceFromScanner(),getDiscountFromScanner());
        Person sasha = new Person("Саша", 500);
        Person alena = new Person("Алена", 1500);
        Person ben = new Person("Бен", 60);
        //Person person = new Person(getPersonNameFromScaner(), getPersonMoneyFromScaner());
        Children kidAlex = new Children("Alex", 500, 5);
        Children kidKira = new Children("Kira", 700, 9);
        Adult adultIvan = new Adult("Ivan", 1000, 35, 1000);
        Pensioner oldBob = new Pensioner("Bob", 500);

        List<Product> productList = new ArrayList<>();
        productList.add(milk);
        productList.add(bread);
        productList.add(beer);
        productList.add(chiken);
        productList.add(fish);
        //productList.add(product);
        productList.add(sugar);
        //productList.add(discountProduct);
        productList.add(coffee);
        productList.add(vegetables);

        List<Person> visitors = new ArrayList<>();
        visitors.add(sasha);
        visitors.add(alena);
        visitors.add(ben);
        //visitors.add(person);
        visitors.add(kidAlex);
        visitors.add(kidKira);
        visitors.add(adultIvan);
        visitors.add(oldBob);

        LinkedList<Person> per = new LinkedList(visitors);
        Random randomProduct = new Random();

        while (!per.isEmpty()) {
            Person currentVisitor = per.getFirst();
            Product currentProduct = productList.get(randomProduct.nextInt(productList.size()));
            if (currentVisitor.tryToBySmth(currentProduct) == 1) {
                per.removeFirst();
            }
        }
        System.out.println(visitors);
    }
    public static String getPersonNameFromScaner() {
        System.out.println("Введите имя покупателя");
        Scanner scanPersonName = new Scanner(System.in);
        String personName = scanPersonName.nextLine();
        while (personName == "" || personName == null) {
            System.out.println("Имя покупателя не может быть пустым");
            personName = scanPersonName.nextLine();
        }
        return personName;
    }
    public static int getPersonMoneyFromScaner() {
        System.out.println("Введите кол-во денег покупателя");
        Scanner scanPersonMoney = new Scanner(System.in);
        int personMoney = scanPersonMoney.nextInt();
        while (personMoney < 0) {
            System.out.println("Кол-во денег не может быть отрицательным");
            personMoney = scanPersonMoney.nextInt();
        }
        return personMoney;
    }
    public static String getProductNameFromScaner() {
        System.out.println("Введите название продукта");
        String regex = "\\d+";
        Scanner scanProductName = new Scanner(System.in);
        String productName = scanProductName.nextLine();
        while (productName == "" || productName == null || productName.length() < 3 || productName.matches(regex)) {
            System.out.println("Названия продукта некорректно, введите снова");
            productName = scanProductName.nextLine();
        }
        return productName;
    }
    public static int getProductPriceFromScanner() {
        System.out.println("Введите цену продукта");
        Scanner scanProductPrice = new Scanner(System.in);
        int productPrice = scanProductPrice.nextInt();
        while (productPrice <= 0) {
            System.out.println("Цена продукта не может быть отрицательным");
            productPrice = scanProductPrice.nextInt();
        }
        return productPrice;
    }
    public static int getDiscountFromScanner() {
        System.out.println("Введите величину скидки");
        Scanner scanDiscount = new Scanner(System.in);
        int discount = scanDiscount.nextInt();
        while (discount <= 0 || discount > 100) {
            System.out.println("Величина скидки некорректна, введите снова");
            discount = scanDiscount.nextInt();
        }
        return discount;
    }

    public static boolean productAvailableForKids(){
        boolean isAvailable = false;
        System.out.println("Доступен ли товар для детей?");
        Scanner scannerAvailableForKids = new Scanner(System.in);
        String innerText = scannerAvailableForKids.nextLine();
        while (!innerText.equals("да") && !innerText.equals("нет")){
            System.out.println("Некорректный ввод признака, введите снова");
            innerText = scannerAvailableForKids.nextLine();
        }
        if (innerText.equals("да")){
            isAvailable = true;
        }
        else {
            isAvailable = false;
        }
        return isAvailable;
    }


}
