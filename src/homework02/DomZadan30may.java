package homework02;

import java.util.Scanner;

public class DomZadan30may {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру по Фаренгейту: ");
        float num1 = scan.nextFloat();
        float num2 = (num1 - 32) / 1.8f;
        System.out.print("Температура по Цельсию составляет: " + num2);
    }
}
