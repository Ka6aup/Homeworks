package homework08;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        File inputFilePerson = new File("D:\\Обучение\\DZ\\src\\homework08\\Person.txt");
        File inputFileProduct = new File("D:\\Обучение\\DZ\\src\\homework08\\Product.txt");
        File outputFileResult = new File("D:\\Обучение\\DZ\\src\\homework08\\Result.txt");

        Scanner s = new Scanner(inputFilePerson);
        ArrayList<Person> personList = new ArrayList<Person>();
        while (s.hasNextLine()) {
            String[] line = s.nextLine().split("=");
            personList.add(new Person(line[0], Double.parseDouble(line[1])));
        }
        s.close();
        personList.forEach(System.out::println);


        s = new Scanner(inputFileProduct);
        ArrayList<Product> productList = new ArrayList<Product>();
        while (s.hasNextLine()) {
            String[] line = s.nextLine().split("=");
            productList.add(new Product(line[0], Double.parseDouble(line[1])));
        }
        s.close();
        productList.forEach(System.out::println);
        FileOutputStream outputStream = new FileOutputStream(outputFileResult);


        for (Person persons : personList) {
            String buyerString = "Покупает: " + persons.getName();
            System.out.println(buyerString);
            writeFile(outputStream, buyerString);
            if (persons.getCash() < 0) {
                String str = "Отрицательное число денег";
                System.out.println("Отрицательное число денег");
                writeFile(outputStream, str);
                continue;
            }
            if (persons.getCash() == 0) {
                String str = "Нет денег";
                System.out.println("Нет денег");
                writeFile(outputStream, str);
                continue;
            }
            try {
                for (int i = 0; i < 3; i++) {
                    Product product = productList.get((int) (Math.random() * productList.size()));
                    persons.byuProduct(product);
                    String buyString = "Купил: " + product.getProductName();
                    System.out.println(buyString);
                    writeFile(outputStream, buyString);
                }
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                writeFile(outputStream, ex.getMessage());
            }
        }
    }
    private static void writeFile(FileOutputStream outputStream, String ex) throws IOException {
        outputStream.write(ex.getBytes());
        outputStream.write(System.lineSeparator().getBytes());
    }
}
