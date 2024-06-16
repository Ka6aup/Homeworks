package homework03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Television tv1 = new Television("Samsung", 2019, false);
        Television tv2 = new Television("Philips", 2024, true);
        Television tv3 = new Television("Лидер", 2013, false);
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

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
