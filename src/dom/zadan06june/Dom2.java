package dom.zadan06june;
import java.util.Scanner;


public class Dom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String sequence = sc.nextLine();
        int arrowsCount = 0;
        for (int i = 0; i < sequence.length() - 4; i++) {
            if (sequence.substring(i, i + 5).equals(">>-->") || sequence.substring(i, i + 5).equals("<--<<")) {
                arrowsCount++;
            }
        }
        System.out.println("Количество стрел: " + arrowsCount);
    }
}
