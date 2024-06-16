package homework02;

import java.util.Scanner;

public class Dom2Zadan30may {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е целое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе целое число:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Сумма двух целых чисел: " + sum);

        int raz = Math.abs(num1 - num2);
        System.out.println("Разница двух целых чисел: " + raz);

        int pro = num1 * num2;
        System.out.println("Произведение из двух целых чисел: " + pro);

        double average = (num1 + num2) / 2;
        System.out.println("Среднее из двух целых чисел: " + average);

        System.out.println("Расстояние двух целых чисел: " + raz);

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        System.out.println("Максимальное целое число: " + max);
        System.out.println("Минимальное целое число: " + min);

        sc.close();
    }
}