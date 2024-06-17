package homework05Addition;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Television[] tvArray = new Television[10];
        for (int i = 0; i < tvArray.length; i++) {
            System.out.println("Введите информацию " + (i + 1) + ":");
            System.out.print("Пожалуйста, введите название телевизора: ");
            String brand = sc.next();
            System.out.print("Пожалуйста, введите год выпуска телевизора: ");
            int year = sc.nextInt();
            System.out.print("Нужен ли Вам Смарт телевизор? да-true, нет-false: ");
            boolean smart = sc.nextBoolean();
            System.out.print("Номер канала: ");
            int channel = sc.nextInt();
            System.out.print("Громкость (0-100): ");
            int volume = sc.nextInt();
            System.out.print("Телевизор включен? да-true, нет-false: ");
            boolean on = sc.nextBoolean();
            tvArray[i] = new Television(brand, year, smart, channel, volume, on);
        }

        System.out.print("Введите макс. громкость (от 50 до 70): ");
        int max = sc.nextInt();
        Arrays.stream(tvArray)
                .filter(tv -> tv.isOn() && tv.getVolume() <= max)
                .sorted(Comparator.comparingInt(Television::getChannel))
                .forEach(System.out::println);


    }
}