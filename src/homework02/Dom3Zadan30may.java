package homework02;

import java.util.Scanner;

public class Dom3Zadan30may {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите необходимое слово: ");
        String word = scanner.nextLine();
        System.out.print("Введите необходимое число повторений: ");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++)
        {
            System.out.print(word);
        }
    }
}





