package Television;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите название телевизора: ");
        String name = sc.nextLine();
        System.out.println("Пожалуйста, введите год выпуска телевизора: ");
        int age = sc.nextInt();
        System.out.println("Нужен ли Вам Смарт телевизор? да-true, нет-false: ");
        boolean sm = sc.nextBoolean();

        Television tv = new Television(name, age, sm);

        String name1 = tv.getBrand();
        int age1 = tv.getYear();
        boolean sm1 = tv.isSmart();

        System.out.println("Ваш телевизор - " + name1 + ", " + age1 + " года выпуска, смарт - " + sm1);


    }
}
