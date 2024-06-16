package homework04;
import java.util.Scanner;
import java.util.Arrays;


public class Dom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строк: ");
        String[] st = sc.nextLine().split(" ");
        for (String s : st) {
            char[] chars = s.toLowerCase().toCharArray();
            Arrays.sort(chars);
            System.out.print(new String(chars) + " ");

        }
    }
}
